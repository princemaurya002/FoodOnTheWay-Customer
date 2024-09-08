// Generated by view binder compiler. Do not edit!
package com.example.foodontheway.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.denzcoskun.imageslider.ImageSlider;
import com.example.foodontheway.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentHomeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final RecyclerView PopularRecyclerView;

  @NonNull
  public final TextView ViewMenu;

  @NonNull
  public final CardView cardView;

  @NonNull
  public final ImageSlider imageSlider;

  @NonNull
  public final TextView textView12;

  private FragmentHomeBinding(@NonNull ConstraintLayout rootView,
      @NonNull RecyclerView PopularRecyclerView, @NonNull TextView ViewMenu,
      @NonNull CardView cardView, @NonNull ImageSlider imageSlider, @NonNull TextView textView12) {
    this.rootView = rootView;
    this.PopularRecyclerView = PopularRecyclerView;
    this.ViewMenu = ViewMenu;
    this.cardView = cardView;
    this.imageSlider = imageSlider;
    this.textView12 = textView12;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.PopularRecyclerView;
      RecyclerView PopularRecyclerView = ViewBindings.findChildViewById(rootView, id);
      if (PopularRecyclerView == null) {
        break missingId;
      }

      id = R.id.ViewMenu;
      TextView ViewMenu = ViewBindings.findChildViewById(rootView, id);
      if (ViewMenu == null) {
        break missingId;
      }

      id = R.id.cardView;
      CardView cardView = ViewBindings.findChildViewById(rootView, id);
      if (cardView == null) {
        break missingId;
      }

      id = R.id.image_slider;
      ImageSlider imageSlider = ViewBindings.findChildViewById(rootView, id);
      if (imageSlider == null) {
        break missingId;
      }

      id = R.id.textView12;
      TextView textView12 = ViewBindings.findChildViewById(rootView, id);
      if (textView12 == null) {
        break missingId;
      }

      return new FragmentHomeBinding((ConstraintLayout) rootView, PopularRecyclerView, ViewMenu,
          cardView, imageSlider, textView12);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
