// Generated by view binder compiler. Do not edit!
package com.example.foodontheway.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.foodontheway.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentHistoryBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final CardView RecentOrder;

  @NonNull
  public final ImageView buyAgainFoodImage;

  @NonNull
  public final CardView buyAgainFoodImageCard;

  @NonNull
  public final TextView buyAgainFoodName;

  @NonNull
  public final TextView buyAgainFoodPrice;

  @NonNull
  public final RecyclerView buyAgainRecyclerView;

  @NonNull
  public final CardView cardView6;

  @NonNull
  public final AppCompatButton isRecievedButton;

  @NonNull
  public final TextView textView18;

  @NonNull
  public final TextView textView19;

  private FragmentHistoryBinding(@NonNull FrameLayout rootView, @NonNull CardView RecentOrder,
      @NonNull ImageView buyAgainFoodImage, @NonNull CardView buyAgainFoodImageCard,
      @NonNull TextView buyAgainFoodName, @NonNull TextView buyAgainFoodPrice,
      @NonNull RecyclerView buyAgainRecyclerView, @NonNull CardView cardView6,
      @NonNull AppCompatButton isRecievedButton, @NonNull TextView textView18,
      @NonNull TextView textView19) {
    this.rootView = rootView;
    this.RecentOrder = RecentOrder;
    this.buyAgainFoodImage = buyAgainFoodImage;
    this.buyAgainFoodImageCard = buyAgainFoodImageCard;
    this.buyAgainFoodName = buyAgainFoodName;
    this.buyAgainFoodPrice = buyAgainFoodPrice;
    this.buyAgainRecyclerView = buyAgainRecyclerView;
    this.cardView6 = cardView6;
    this.isRecievedButton = isRecievedButton;
    this.textView18 = textView18;
    this.textView19 = textView19;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHistoryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHistoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_history, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHistoryBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.RecentOrder;
      CardView RecentOrder = ViewBindings.findChildViewById(rootView, id);
      if (RecentOrder == null) {
        break missingId;
      }

      id = R.id.buyAgainFoodImage;
      ImageView buyAgainFoodImage = ViewBindings.findChildViewById(rootView, id);
      if (buyAgainFoodImage == null) {
        break missingId;
      }

      id = R.id.buyAgainFoodImageCard;
      CardView buyAgainFoodImageCard = ViewBindings.findChildViewById(rootView, id);
      if (buyAgainFoodImageCard == null) {
        break missingId;
      }

      id = R.id.buyAgainFoodName;
      TextView buyAgainFoodName = ViewBindings.findChildViewById(rootView, id);
      if (buyAgainFoodName == null) {
        break missingId;
      }

      id = R.id.buyAgainFoodPrice;
      TextView buyAgainFoodPrice = ViewBindings.findChildViewById(rootView, id);
      if (buyAgainFoodPrice == null) {
        break missingId;
      }

      id = R.id.buyAgainRecyclerView;
      RecyclerView buyAgainRecyclerView = ViewBindings.findChildViewById(rootView, id);
      if (buyAgainRecyclerView == null) {
        break missingId;
      }

      id = R.id.cardView6;
      CardView cardView6 = ViewBindings.findChildViewById(rootView, id);
      if (cardView6 == null) {
        break missingId;
      }

      id = R.id.isRecievedButton;
      AppCompatButton isRecievedButton = ViewBindings.findChildViewById(rootView, id);
      if (isRecievedButton == null) {
        break missingId;
      }

      id = R.id.textView18;
      TextView textView18 = ViewBindings.findChildViewById(rootView, id);
      if (textView18 == null) {
        break missingId;
      }

      id = R.id.textView19;
      TextView textView19 = ViewBindings.findChildViewById(rootView, id);
      if (textView19 == null) {
        break missingId;
      }

      return new FragmentHistoryBinding((FrameLayout) rootView, RecentOrder, buyAgainFoodImage,
          buyAgainFoodImageCard, buyAgainFoodName, buyAgainFoodPrice, buyAgainRecyclerView,
          cardView6, isRecievedButton, textView18, textView19);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
