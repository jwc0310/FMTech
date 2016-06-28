import android.animation.Animator;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.HashMap;
import java.util.Map;

public class luv
  extends bj
{
  public boolean Z;
  private View aa;
  private Animator ab;
  
  public static Bundle a(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    Bundle localBundle = new Bundle();
    if (paramString1 != null) {
      localBundle.putString("title", paramString1);
    }
    localBundle.putString("message", paramString2);
    if (paramString3 != null) {
      localBundle.putString("submessage", paramString3);
    }
    localBundle.putBoolean("is_animated", paramBoolean);
    return localBundle;
  }
  
  public static luv a(String paramString1, String paramString2, String paramString3, boolean paramBoolean1, boolean paramBoolean2, Context paramContext)
  {
    return a(null, paramString2, null, false, paramBoolean2, null);
  }
  
  public static luv a(String paramString1, String paramString2, String paramString3, boolean paramBoolean1, boolean paramBoolean2, bk parambk)
  {
    Bundle localBundle = a(paramString1, paramString2, paramString3, paramBoolean2);
    luv localluv = new luv();
    localluv.f(localBundle);
    localluv.b(paramBoolean1);
    localluv.n = parambk;
    localluv.p = 0;
    return localluv;
  }
  
  private final void v()
  {
    if (this.ab == null)
    {
      HashMap localHashMap = new HashMap(3);
      localHashMap.put("LEFT 1", this.aa.findViewById(aw.eC));
      localHashMap.put("CENTER 1", this.aa.findViewById(aw.eD));
      localHashMap.put("RIGHT 1", this.aa.findViewById(aw.eE));
      if (gyo.a == null) {
        gyo.a = new gyo();
      }
      this.ab = gyo.a.a(f(), efj.ZR, localHashMap, -1.0F, -1.0F);
      this.ab.addListener(new luw(this));
    }
    if (this.ab.isStarted()) {
      this.ab.cancel();
    }
    this.ab.start();
  }
  
  private final boolean w()
  {
    if (Build.VERSION.SDK_INT >= 14) {}
    for (int i = 1; (i != 0) && (this.m.getBoolean("is_animated")); i = 0) {
      return true;
    }
    return false;
  }
  
  public View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    if (!w()) {
      return super.a(paramLayoutInflater, paramViewGroup, paramBundle);
    }
    this.aa = paramLayoutInflater.inflate(efj.ZO, null);
    TextView localTextView1 = (TextView)this.aa.findViewById(aw.eF);
    String str1 = this.m.getString("message");
    localTextView1.setText(str1);
    localTextView1.setContentDescription(str1);
    TextView localTextView2 = (TextView)this.aa.findViewById(aw.eG);
    String str2 = this.m.getString("submessage");
    if (!TextUtils.isEmpty(str2))
    {
      localTextView2.setText(str2);
      localTextView2.setContentDescription(str2);
      localTextView2.setVisibility(0);
    }
    v();
    return this.aa;
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (w()) {
      a(1, this.a);
    }
  }
  
  public final void a(bw parambw, String paramString)
  {
    try
    {
      super.a(parambw, paramString);
      return;
    }
    catch (IllegalStateException localIllegalStateException) {}
  }
  
  public final Dialog c(Bundle paramBundle)
  {
    Bundle localBundle = this.m;
    if (w()) {
      return super.c(paramBundle);
    }
    ProgressDialog localProgressDialog = new ProgressDialog(f());
    if (localBundle.containsKey("title")) {
      localProgressDialog.setTitle(localBundle.getString("title"));
    }
    localProgressDialog.setMessage(localBundle.getString("message"));
    localProgressDialog.setCanceledOnTouchOutside(this.b);
    localProgressDialog.setProgressStyle(0);
    return localProgressDialog;
  }
  
  public final void m()
  {
    super.m();
    this.Z = false;
    if ((this.ab != null) && (!this.ab.isStarted())) {
      v();
    }
  }
  
  public final void n()
  {
    super.n();
    this.Z = true;
    if ((this.ab != null) && (this.ab.isStarted())) {
      this.ab.cancel();
    }
  }
  
  public void onCancel(DialogInterface paramDialogInterface)
  {
    super.onCancel(paramDialogInterface);
    bk localbk = this.n;
    if ((localbk instanceof lux)) {
      ((lux)localbk).h(this.m);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     luv
 * JD-Core Version:    0.7.0.1
 */