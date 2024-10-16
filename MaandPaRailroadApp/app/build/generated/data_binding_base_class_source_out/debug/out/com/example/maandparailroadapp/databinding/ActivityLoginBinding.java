// Generated by view binder compiler. Do not edit!
package com.example.maandparailroadapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
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

public final class ActivityLoginBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView Login;

  @NonNull
  public final Button btnLogin;

  @NonNull
  public final EditText enterPassword;

  @NonNull
  public final EditText enterUsername;

  @NonNull
  public final TextView forgotPassword;

  @NonNull
  public final TextView textViewSignUp;

  private ActivityLoginBinding(@NonNull ConstraintLayout rootView, @NonNull TextView Login,
      @NonNull Button btnLogin, @NonNull EditText enterPassword, @NonNull EditText enterUsername,
      @NonNull TextView forgotPassword, @NonNull TextView textViewSignUp) {
    this.rootView = rootView;
    this.Login = Login;
    this.btnLogin = btnLogin;
    this.enterPassword = enterPassword;
    this.enterUsername = enterUsername;
    this.forgotPassword = forgotPassword;
    this.textViewSignUp = textViewSignUp;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Login;
      TextView Login = ViewBindings.findChildViewById(rootView, id);
      if (Login == null) {
        break missingId;
      }

      id = R.id.btnLogin;
      Button btnLogin = ViewBindings.findChildViewById(rootView, id);
      if (btnLogin == null) {
        break missingId;
      }

      id = R.id.enterPassword;
      EditText enterPassword = ViewBindings.findChildViewById(rootView, id);
      if (enterPassword == null) {
        break missingId;
      }

      id = R.id.enterUsername;
      EditText enterUsername = ViewBindings.findChildViewById(rootView, id);
      if (enterUsername == null) {
        break missingId;
      }

      id = R.id.forgotPassword;
      TextView forgotPassword = ViewBindings.findChildViewById(rootView, id);
      if (forgotPassword == null) {
        break missingId;
      }

      id = R.id.textViewSignUp;
      TextView textViewSignUp = ViewBindings.findChildViewById(rootView, id);
      if (textViewSignUp == null) {
        break missingId;
      }

      return new ActivityLoginBinding((ConstraintLayout) rootView, Login, btnLogin, enterPassword,
          enterUsername, forgotPassword, textViewSignUp);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
