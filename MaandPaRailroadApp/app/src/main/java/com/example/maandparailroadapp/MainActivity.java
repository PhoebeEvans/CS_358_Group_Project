package com.example.maandparailroadapp;

import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import android.view.MenuItem;
import com.example.maandparailroadapp.databinding.ActivityMainBinding;
import com.google.android.material.snackbar.Snackbar;
import android.content.Intent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import com.example.maandparailroadapp.database.DBHelper;


public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;
    private SessionManager sessionManager;

    private DBHelper dbHelper;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        User admin = new User("Admin", "test@gmail.com", "password", 1);

        dbHelper = DBHelper.getInstance(MainActivity.this);
        dbHelper.insertUser(admin);

        sessionManager = new SessionManager(this);

        if (!sessionManager.isLoggedIn()) {
            startActivity(new Intent(MainActivity.this, LoginActivity.class));
            finish();
        }

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        DrawerLayout drawerLayout = binding.drawerLayout;
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);

        // Set up AppBarConfiguration for drawer navigation
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph())
                .setOpenableLayout(drawerLayout)
                .build();

        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(view -> {
            Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
            emailIntent.setData(Uri.parse("mailto:")); // Ensure only email apps handle this
            emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"info@maandparailroad.com"}); // Add email address
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Contact Us"); // Add email subject

            if (emailIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(emailIntent);
            } else {
                Snackbar.make(view, "No email app found", Snackbar.LENGTH_LONG).show();
            }
        });
        /*
        @author Griffin
         */
        // Handle menu item clicks in NavigationView using if-else
        binding.navView.setNavigationItemSelectedListener(item -> {
            int itemId = item.getItemId();

            if (itemId == R.id.nav_home) {
                navController.navigate(R.id.FirstFragment); // Navigate to FirstFragment (Home)
            } else if (itemId == R.id.nav_gallery) {
                navController.navigate(R.id.GalleryFragment); // Navigate to GalleryFragment
            } else if (itemId == R.id.nav_village) {
                navController.navigate(R.id.VillageFragment); // Navigate to VillageFragment
            } else if (itemId == R.id.nav_train_ride) {
                navController.navigate(R.id.TrainRideFragment); // Navigate to TrainRideFragment
            } else if (itemId == R.id.nav_hours) {
                navController.navigate(R.id.HoursFragment); // Navigate to HoursFragment
            } else if (itemId == R.id.nav_events) {
                navController.navigate(R.id.EventsFragment); // Navigate to EventsFragment
            } else if (itemId == R.id.nav_directions) {
                navController.navigate(R.id.DirectionsFragment); // Navigate to DirectionsFragment
            } else if (itemId == R.id.nav_contact) {
                navController.navigate(R.id.ContactFragment); // Navigate to ContactFragment
            } else if (itemId == R.id.nav_maps) {
                Intent intent = new Intent(MainActivity.this, MapActivity.class);
                startActivity(intent);
            } else if (itemId == R.id.login){
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
            } else if (itemId == R.id.register){
                startActivity(new Intent(MainActivity.this, UserProfileActivity.class));
            } else if (itemId == R.id.admin){
                startActivity(new Intent(MainActivity.this, AdminDashboardActivity.class));
            } else if (itemId == R.id.logout){
                sessionManager.logoutUser();
                startActivity(new Intent(MainActivity.this, MainActivity.class));
            }else if (itemId == R.id.nav_equipment) {
                navController.navigate(R.id.EquipmentFragment); // Navigate to EquipmentFragment
            }else if (itemId == R.id.nav_explore) {
                navController.navigate(R.id.ExploreVillageFragment); // Navigate to ExploreVillageFragment
            }else if (itemId == R.id.nav_history) {
                navController.navigate(R.id.HistoryFragment); // Navigate to HistoryFragment
            }else if (itemId == R.id.nav_industries) {
                navController.navigate(R.id.IndustriesFragment); // Navigate to IndustriesFragment
            }else if (itemId == R.id.nav_join) {
                navController.navigate(R.id.JoinFragment); // Navigate to JoinFragment
            }else if (itemId == R.id.nav_links) {
                navController.navigate(R.id.LinksFragment); // Navigate to LinksFragment
            }else if (itemId == R.id.nav_memories) {
                navController.navigate(R.id.MemoriesFragment); // Navigate to MemoriesFragment
            }else if (itemId == R.id.nav_newsletter) {
                navController.navigate(R.id.NewsletterFragment); // Navigate to NewsletterFragment
            }

            drawerLayout.closeDrawers(); // Close drawer after selecting
            return true;
        });

        Button facebookButton = findViewById(R.id.button_facebook);
        Button amazonButton = findViewById(R.id.button_amazon);
        facebookButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
            intent.putExtra("url", "https://www.facebook.com/MaAndPaRailroad");
            startActivity(intent);
        });
        amazonButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
            intent.putExtra("url", "https://www.amazon.com/gp/product/B0013JWTHY/ref=as_li_tf_tl?ie=UTF8&camp=1789&creative=9325&creativeASIN=B0013JWTHY&linkCode=as2&tag=maparaipresoc-20");
            startActivity(intent);
        });
    /*
        if (savedInstanceState == null) {
            AdminSavedEventsFragment fragment = new AdminSavedEventsFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.fragment_container, fragment);
            fragmentTransaction.commit();
        }*/

    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration) || super.onSupportNavigateUp();
    }

    @Override
    protected void onResume() {
        super.onResume();

        Button facebookButton = findViewById(R.id.button_facebook);
        Button amazonButton = findViewById(R.id.button_amazon);
        facebookButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
            intent.putExtra("url", "https://www.facebook.com/MaAndPaRailroad");
            startActivity(intent);
        });
        amazonButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
            intent.putExtra("url", "https://www.amazon.com/gp/product/B0013JWTHY/ref=as_li_tf_tl?ie=UTF8&camp=1789&creative=9325&creativeASIN=B0013JWTHY&linkCode=as2&tag=maparaipresoc-20");
            startActivity(intent);
        });

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(view -> {
            Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
            emailIntent.setData(Uri.parse("mailto:")); // Ensure only email apps handle this
            emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"info@maandparailroad.com"}); // Add email address
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Contact Us"); // Add email subject

            if (emailIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(emailIntent);
            } else {
                Snackbar.make(view, "No email app found", Snackbar.LENGTH_LONG).show();
            }
        });
    }
}
