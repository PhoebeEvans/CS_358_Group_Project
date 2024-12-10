// Generated by view binder compiler. Do not edit!
package com.example.maandparailroadapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.maandparailroadapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class UserProfileBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView backTitle;

  @NonNull
  public final FrameLayout fragmentContainer;

  @NonNull
  public final Button newBtn;

  @NonNull
  public final Button saveButton;

  @NonNull
  public final EditText userProfileConfirmPassword;

  @NonNull
  public final EditText userProfileCurrentPassword;

  @NonNull
  public final EditText userProfileEmail;

  @NonNull
  public final EditText userProfileNewPassword;

  @NonNull
  public final TextView userProfileTitle;

  @NonNull
  public final TextView userProfileTitle2;

  @NonNull
  public final EditText userProfileUsername;

  private UserProfileBinding(@NonNull ConstraintLayout rootView, @NonNull TextView backTitle,
      @NonNull FrameLayout fragmentContainer, @NonNull Button newBtn, @NonNull Button saveButton,
      @NonNull EditText userProfileConfirmPassword, @NonNull EditText userProfileCurrentPassword,
      @NonNull EditText userProfileEmail, @NonNull EditText userProfileNewPassword,
      @NonNull TextView userProfileTitle, @NonNull TextView userProfileTitle2,
      @NonNull EditText userProfileUsername) {
    this.rootView = rootView;
    this.backTitle = backTitle;
    this.fragmentContainer = fragmentContainer;
    this.newBtn = newBtn;
    this.saveButton = saveButton;
    this.userProfileConfirmPassword = userProfileConfirmPassword;
    this.userProfileCurrentPassword = userProfileCurrentPassword;
    this.userProfileEmail = userProfileEmail;
    this.userProfileNewPassword = userProfileNewPassword;
    this.userProfileTitle = userProfileTitle;
    this.userProfileTitle2 = userProfileTitle2;
    this.userProfileUsername = userProfileUsername;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static UserProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static UserProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.user_profile, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static UserProfileBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.backTitle;
      TextView backTitle = ViewBindings.findChildViewById(rootView, id);
      if (backTitle == null) {
        break missingId;
      }

      id = R.id.fragment_container;
      FrameLayout fragmentContainer = ViewBindings.findChildViewById(rootView, id);
      if (fragmentContainer == null) {
        break missingId;
      }

      id = R.id.newBtn;
      Button newBtn = ViewBindings.findChildViewById(rootView, id);
      if (newBtn == null) {
        break missingId;
      }

      id = R.id.saveButton;
      Button saveButton = ViewBindings.findChildViewById(rootView, id);
      if (saveButton == null) {
        break missingId;
      }

      id = R.id.userProfileConfirmPassword;
      EditText userProfileConfirmPassword = ViewBindings.findChildViewById(rootView, id);
      if (userProfileConfirmPassword == null) {
        break missingId;
      }

      id = R.id.userProfileCurrentPassword;
      EditText userProfileCurrentPassword = ViewBindings.findChildViewById(rootView, id);
      if (userProfileCurrentPassword == null) {
        break missingId;
      }

      id = R.id.userProfileEmail;
      EditText userProfileEmail = ViewBindings.findChildViewById(rootView, id);
      if (userProfileEmail == null) {
        break missingId;
      }

      id = R.id.userProfileNewPassword;
      EditText userProfileNewPassword = ViewBindings.findChildViewById(rootView, id);
      if (userProfileNewPassword == null) {
        break missingId;
      }

      id = R.id.userProfileTitle;
      TextView userProfileTitle = ViewBindings.findChildViewById(rootView, id);
      if (userProfileTitle == null) {
        break missingId;
      }

      id = R.id.userProfileTitle2;
      TextView userProfileTitle2 = ViewBindings.findChildViewById(rootView, id);
      if (userProfileTitle2 == null) {
        break missingId;
      }

      id = R.id.userProfileUsername;
      EditText userProfileUsername = ViewBindings.findChildViewById(rootView, id);
      if (userProfileUsername == null) {
        break missingId;
      }

      return new UserProfileBinding((ConstraintLayout) rootView, backTitle, fragmentContainer,
          newBtn, saveButton, userProfileConfirmPassword, userProfileCurrentPassword,
          userProfileEmail, userProfileNewPassword, userProfileTitle, userProfileTitle2,
          userProfileUsername);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}