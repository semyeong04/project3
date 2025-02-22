// Generated by view binder compiler. Do not edit!
package com.project.project3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.project.project3.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMenuModBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnModMenu;

  @NonNull
  public final Button btnPicMod;

  @NonNull
  public final TextView cafe;

  @NonNull
  public final TextView chinese;

  @NonNull
  public final EditText etModExplain;

  @NonNull
  public final EditText etModMenu;

  @NonNull
  public final EditText etModPrice;

  @NonNull
  public final ImageView imageView5;

  @NonNull
  public final ImageView imgHome4;

  @NonNull
  public final ImageView imgInfo4;

  @NonNull
  public final ImageView imgModMenu;

  @NonNull
  public final TextView japanese;

  @NonNull
  public final Spinner spNowMenu;

  @NonNull
  public final TextView textView45;

  @NonNull
  public final TextView textView46;

  @NonNull
  public final TextView textView8;

  private ActivityMenuModBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnModMenu,
      @NonNull Button btnPicMod, @NonNull TextView cafe, @NonNull TextView chinese,
      @NonNull EditText etModExplain, @NonNull EditText etModMenu, @NonNull EditText etModPrice,
      @NonNull ImageView imageView5, @NonNull ImageView imgHome4, @NonNull ImageView imgInfo4,
      @NonNull ImageView imgModMenu, @NonNull TextView japanese, @NonNull Spinner spNowMenu,
      @NonNull TextView textView45, @NonNull TextView textView46, @NonNull TextView textView8) {
    this.rootView = rootView;
    this.btnModMenu = btnModMenu;
    this.btnPicMod = btnPicMod;
    this.cafe = cafe;
    this.chinese = chinese;
    this.etModExplain = etModExplain;
    this.etModMenu = etModMenu;
    this.etModPrice = etModPrice;
    this.imageView5 = imageView5;
    this.imgHome4 = imgHome4;
    this.imgInfo4 = imgInfo4;
    this.imgModMenu = imgModMenu;
    this.japanese = japanese;
    this.spNowMenu = spNowMenu;
    this.textView45 = textView45;
    this.textView46 = textView46;
    this.textView8 = textView8;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMenuModBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMenuModBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_menu_mod, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMenuModBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnModMenu;
      Button btnModMenu = ViewBindings.findChildViewById(rootView, id);
      if (btnModMenu == null) {
        break missingId;
      }

      id = R.id.btnPicMod;
      Button btnPicMod = ViewBindings.findChildViewById(rootView, id);
      if (btnPicMod == null) {
        break missingId;
      }

      id = R.id.cafe;
      TextView cafe = ViewBindings.findChildViewById(rootView, id);
      if (cafe == null) {
        break missingId;
      }

      id = R.id.chinese;
      TextView chinese = ViewBindings.findChildViewById(rootView, id);
      if (chinese == null) {
        break missingId;
      }

      id = R.id.etModExplain;
      EditText etModExplain = ViewBindings.findChildViewById(rootView, id);
      if (etModExplain == null) {
        break missingId;
      }

      id = R.id.etModMenu;
      EditText etModMenu = ViewBindings.findChildViewById(rootView, id);
      if (etModMenu == null) {
        break missingId;
      }

      id = R.id.etModPrice;
      EditText etModPrice = ViewBindings.findChildViewById(rootView, id);
      if (etModPrice == null) {
        break missingId;
      }

      id = R.id.imageView5;
      ImageView imageView5 = ViewBindings.findChildViewById(rootView, id);
      if (imageView5 == null) {
        break missingId;
      }

      id = R.id.imgHome4;
      ImageView imgHome4 = ViewBindings.findChildViewById(rootView, id);
      if (imgHome4 == null) {
        break missingId;
      }

      id = R.id.imgInfo4;
      ImageView imgInfo4 = ViewBindings.findChildViewById(rootView, id);
      if (imgInfo4 == null) {
        break missingId;
      }

      id = R.id.imgModMenu;
      ImageView imgModMenu = ViewBindings.findChildViewById(rootView, id);
      if (imgModMenu == null) {
        break missingId;
      }

      id = R.id.japanese;
      TextView japanese = ViewBindings.findChildViewById(rootView, id);
      if (japanese == null) {
        break missingId;
      }

      id = R.id.spNowMenu;
      Spinner spNowMenu = ViewBindings.findChildViewById(rootView, id);
      if (spNowMenu == null) {
        break missingId;
      }

      id = R.id.textView45;
      TextView textView45 = ViewBindings.findChildViewById(rootView, id);
      if (textView45 == null) {
        break missingId;
      }

      id = R.id.textView46;
      TextView textView46 = ViewBindings.findChildViewById(rootView, id);
      if (textView46 == null) {
        break missingId;
      }

      id = R.id.textView8;
      TextView textView8 = ViewBindings.findChildViewById(rootView, id);
      if (textView8 == null) {
        break missingId;
      }

      return new ActivityMenuModBinding((ConstraintLayout) rootView, btnModMenu, btnPicMod, cafe,
          chinese, etModExplain, etModMenu, etModPrice, imageView5, imgHome4, imgInfo4, imgModMenu,
          japanese, spNowMenu, textView45, textView46, textView8);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
