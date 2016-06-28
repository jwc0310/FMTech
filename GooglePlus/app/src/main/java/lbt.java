import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentFilter.MalformedMimeTypeException;
import android.content.res.Resources;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.google.android.libraries.social.media.ui.MediaView;
import java.util.ArrayList;

public final class lbt
  extends mca
  implements View.OnClickListener, gzi, iud
{
  ipf Z;
  kyp a;
  private final guf aa = new lbu(this);
  private final guf ab = new lbv(this);
  private String ac;
  private MediaView ad;
  private ImageButton ae;
  private ProgressBar af;
  private Uri ag;
  private Uri ah;
  RectF b = new RectF(0.0F, 0.0F, 1.0F, 1.0F);
  final gug c = new gug(this.bp, (byte)0).a(this.bo).a(dl.ai, this.aa).a(dl.ah, this.ab);
  git d;
  
  private void w()
  {
    int i;
    int j;
    label21:
    ProgressBar localProgressBar;
    int k;
    if (this.ag != null)
    {
      i = 1;
      ImageButton localImageButton = this.ae;
      if (i == 0) {
        break label52;
      }
      j = 8;
      localImageButton.setVisibility(j);
      localProgressBar = this.af;
      k = 0;
      if (i == 0) {
        break label57;
      }
    }
    for (;;)
    {
      localProgressBar.setVisibility(k);
      return;
      i = 0;
      break;
      label52:
      j = 0;
      break label21;
      label57:
      k = 8;
    }
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    return paramLayoutInflater.inflate(aw.ec, paramViewGroup, false);
  }
  
  public final void a(Uri paramUri, long paramLong1, long paramLong2)
  {
    this.af.setProgress((int)(100L * paramLong1 / paramLong2));
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.ac = this.m.getString("square_id");
    if (paramBundle != null)
    {
      this.ag = ((Uri)paramBundle.getParcelable("uploading_image_uri"));
      this.ah = ((Uri)paramBundle.getParcelable("current_data"));
      this.Z = ((ipf)paramBundle.getParcelable("selected_user_photo"));
      this.b = ((RectF)paramBundle.getParcelable("CROP_COORDINATES"));
    }
    mbf localmbf = this.bn;
    if (lcm.a == null)
    {
      IntentFilter localIntentFilter = new IntentFilter();
      lcm.a = localIntentFilter;
      localIntentFilter.addAction("com.google.android.libraries.social.squares.edit.UPLOAD_PROGRESS");
    }
    try
    {
      lcm.a.addDataType("image/*");
      fy.a(localmbf.getApplicationContext()).a(new lcn(this), lcm.a);
      return;
    }
    catch (IntentFilter.MalformedMimeTypeException localMalformedMimeTypeException)
    {
      for (;;)
      {
        Log.e("UploadSquarePhotoTask", "MIME type cannot be recognized.");
      }
    }
  }
  
  public final void a(View paramView, Bundle paramBundle)
  {
    super.a(paramView, paramBundle);
    this.ad = ((MediaView)paramView.findViewById(dl.ae));
    this.ae = ((ImageButton)paramView.findViewById(dl.N));
    this.af = ((ProgressBar)paramView.findViewById(dl.ag));
    this.ad.c(aaw.qd);
    this.ad.d(aaw.qd);
    this.ad.n = true;
    int[] arrayOfInt = new int[3];
    arrayOfInt[0] = g().getColor(aaw.qc);
    arrayOfInt[1] = g().getColor(aaw.qe);
    arrayOfInt[2] = g().getColor(aaw.qc);
    GradientDrawable localGradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, arrayOfInt);
    localGradientDrawable.setGradientType(0);
    this.ad.b(localGradientDrawable);
    this.ae.setOnClickListener(this);
    w();
    if (paramBundle != null) {
      this.ad.a((ipf)paramBundle.getParcelable("current_media_ref"));
    }
  }
  
  public final void a(String paramString)
  {
    if (!TextUtils.isEmpty(paramString)) {
      this.ad.a(ipf.a(this.bn, paramString, ipm.a));
    }
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    if ("UploadSquarePhotoTask".equals(paramString)) {
      if (paramhae.b != 200)
      {
        m = 1;
        if (m == 0)
        {
          str = paramhae.a().getString("photo_url");
          if (str != null) {
            a(str);
          }
          Toast.makeText(this.bn, ev.L, 1).show();
        }
        this.ag = null;
        w();
      }
    }
    while (!"CropAndSavePhotoTask".equals(paramString)) {
      for (;;)
      {
        String str;
        return;
        int m = 0;
      }
    }
    if (hae.a(paramhae))
    {
      if (Log.isLoggable(paramString, 4))
      {
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = paramhae.d;
        String.format("onBackgroundTaskFinished failed : %s", arrayOfObject2);
      }
      Toast.makeText(this.bn, ev.f, 1).show();
      return;
    }
    this.ah = ((Uri)paramhae.a().getParcelable("image_uri"));
    int i = paramhae.a().getInt("image_cropped_width");
    int j = paramhae.a().getInt("image_Cropped_height");
    if ((i >= 480) && (j >= 270))
    {
      this.ag = this.ah;
      this.af.setProgress(0);
      this.af.setVisibility(0);
      w();
      lcm locallcm = new lcm(this.bn, this.d.c(), this.ac, this.ag);
      ((gzj)this.bo.a(gzj.class)).b(locallcm);
    }
    for (;;)
    {
      v();
      this.Z = null;
      return;
      mbf localmbf = this.bn;
      int k = ev.M;
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = Integer.valueOf(480);
      arrayOfObject1[1] = Integer.valueOf(270);
      Toast.makeText(localmbf, g().getString(k, arrayOfObject1), 1).show();
    }
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.d = ((git)this.bo.a(git.class));
    ((gzj)this.bo.a(gzj.class)).a.add(this);
    this.a = ((kyp)this.bo.a(kyp.class));
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putParcelable("current_media_ref", this.ad.t);
    paramBundle.putParcelable("uploading_image_uri", this.ag);
    paramBundle.putParcelable("current_data", this.ah);
    paramBundle.putParcelable("selected_user_photo", this.Z);
    paramBundle.putParcelable("CROP_COORDINATES", this.b);
  }
  
  public final void onClick(View paramView)
  {
    if (paramView.getId() == dl.N)
    {
      irs localirs = new irs(this.bn);
      int i = ((git)this.bo.a(git.class)).c();
      localirs.a.putExtra("account_id", i);
      int j = ev.g;
      String str = g().getString(j);
      localirs.a.putExtra("header_text", str);
      localirs.a.putExtra("media_picker_mode", 3);
      Boolean localBoolean = Boolean.valueOf(true);
      localirs.a.putExtra("copy_content_uri_in_picker", localBoolean);
      localirs.a.putExtra("options", 1);
      Intent localIntent = localirs.a;
      this.c.a(dl.ai, localIntent);
    }
  }
  
  final void v()
  {
    if (this.Z != null) {
      if (this.Z.d == null) {
        break label41;
      }
    }
    label41:
    for (int i = 1;; i = 0)
    {
      if (i != 0) {
        efj.a(this.Z.d.toString(), this.bn);
      }
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lbt
 * JD-Core Version:    0.7.0.1
 */