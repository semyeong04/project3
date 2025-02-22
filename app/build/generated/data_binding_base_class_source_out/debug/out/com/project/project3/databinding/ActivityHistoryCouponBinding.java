// Generated by view binder compiler. Do not edit!
package com.project.project3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.project.project3.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityHistoryCouponBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView imageView18;

  @NonNull
  public final ImageView imageView19;

  @NonNull
  public final ImageView imageView21;

  @NonNull
  public final RecyclerView rvUsedCoupon;

  @NonNull
  public final TextView textView25;

  @NonNull
  public final TextView textView48;

  @NonNull
  public final TextView textView49;

  @NonNull
  public final TextView textView50;

  private ActivityHistoryCouponBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageView imageView18, @NonNull ImageView imageView19,
      @NonNull ImageView imageView21, @NonNull RecyclerView rvUsedCoupon,
      @NonNull TextView textView25, @NonNull TextView textView48, @NonNull TextView textView49,
      @NonNull TextView textView50) {
    this.rootView = rootView;
    this.imageView18 = imageView18;
    this.imageView19 = imageView19;
    this.imageView21 = imageView21;
    this.rvUsedCoupon = rvUsedCoupon;
    this.textView25 = textView25;
    this.textView48 = textView48;
    this.textView49 = textView49;
    this.textView50 = textView50;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityHistoryCouponBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityHistoryCouponBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_history_coupon, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityHistoryCouponBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageView18;
      ImageView imageView18 = ViewBindings.findChildViewById(rootView, id);
      if (imageView18 == null) {
        break missingId;
      }

      id = R.id.imageView19;
      ImageView imageView19 = ViewBindings.findChildViewById(rootView, id);
      if (imageView19 == null) {
        break missingId;
      }

      id = R.id.imageView21;
      ImageView imageView21 = ViewBindings.findChildViewById(rootView, id);
      if (imageView21 == null) {
        break missingId;
      }

      id = R.id.rvUsedCoupon;
      RecyclerView rvUsedCoupon = ViewBindings.findChildViewById(rootView, id);
      if (rvUsedCoupon == null) {
        break missingId;
      }

      id = R.id.textView25;
      TextView textView25 = ViewBindings.findChildViewById(rootView, id);
      if (textView25 == null) {
        break missingId;
      }

      id = R.id.textView48;
      TextView textView48 = ViewBindings.findChildViewById(rootView, id);
      if (textView48 == null) {
        break missingId;
      }

      id = R.id.textView49;
      TextView textView49 = ViewBindings.findChildViewById(rootView, id);
      if (textView49 == null) {
        break missingId;
      }

      id = R.id.textView50;
      TextView textView50 = ViewBindings.findChildViewById(rootView, id);
      if (textView50 == null) {
        break missingId;
      }

      return new ActivityHistoryCouponBinding((ConstraintLayout) rootView, imageView18, imageView19,
          imageView21, rvUsedCoupon, textView25, textView48, textView49, textView50);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
