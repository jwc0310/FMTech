import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.maps.GoogleMapOptions;

public class fev
  extends bk
{
  private final fey a = new fey(this);
  private fel b;
  
  public static fev a(GoogleMapOptions paramGoogleMapOptions)
  {
    fev localfev = new fev();
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("MapOptions", paramGoogleMapOptions);
    localfev.f(localBundle);
    return localfev;
  }
  
  private ffj w()
  {
    this.a.a();
    if (this.a.a == null) {
      return null;
    }
    return ((few)this.a.a).a;
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    fey localfey = this.a;
    FrameLayout localFrameLayout = new FrameLayout(paramLayoutInflater.getContext());
    localfey.a(paramBundle, new euv(localfey, localFrameLayout, paramLayoutInflater, paramViewGroup, paramBundle));
    if (localfey.a == null)
    {
      Context localContext = localFrameLayout.getContext();
      int i = eer.a(localContext);
      String str1 = efj.l(localContext, i, eer.e(localContext));
      String str2 = efj.p(localContext, i);
      LinearLayout localLinearLayout = new LinearLayout(localFrameLayout.getContext());
      localLinearLayout.setOrientation(1);
      localLinearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
      localFrameLayout.addView(localLinearLayout);
      TextView localTextView = new TextView(localFrameLayout.getContext());
      localTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
      localTextView.setText(str1);
      localLinearLayout.addView(localTextView);
      if (str2 != null)
      {
        Button localButton = new Button(localContext);
        localButton.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        localButton.setText(str2);
        localLinearLayout.addView(localButton);
        localButton.setOnClickListener(new euw(localContext, i));
      }
    }
    localFrameLayout.setClickable(true);
    return localFrameLayout;
  }
  
  public final void a(Activity paramActivity)
  {
    super.a(paramActivity);
    fey localfey = this.a;
    localfey.d = paramActivity;
    localfey.a();
  }
  
  public final void a(Activity paramActivity, AttributeSet paramAttributeSet, Bundle paramBundle)
  {
    super.a(paramActivity, paramAttributeSet, paramBundle);
    fey localfey1 = this.a;
    localfey1.d = paramActivity;
    localfey1.a();
    GoogleMapOptions localGoogleMapOptions = GoogleMapOptions.a(paramActivity, paramAttributeSet);
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("MapOptions", localGoogleMapOptions);
    fey localfey2 = this.a;
    localfey2.a(paramBundle, new eut(localfey2, paramActivity, localBundle, paramBundle));
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    fey localfey = this.a;
    localfey.a(paramBundle, new euu(localfey, paramBundle));
  }
  
  public final void d(Bundle paramBundle)
  {
    if (paramBundle != null) {
      paramBundle.setClassLoader(fev.class.getClassLoader());
    }
    super.d(paramBundle);
  }
  
  public final void d_()
  {
    fey localfey = this.a;
    if (localfey.a != null) {
      localfey.a.c();
    }
    for (;;)
    {
      super.d_();
      return;
      localfey.a(2);
    }
  }
  
  public final void e(Bundle paramBundle)
  {
    if (paramBundle != null) {
      paramBundle.setClassLoader(fev.class.getClassLoader());
    }
    super.e(paramBundle);
    fey localfey = this.a;
    if (localfey.a != null) {
      localfey.a.b(paramBundle);
    }
    while (localfey.b == null) {
      return;
    }
    paramBundle.putAll(localfey.b);
  }
  
  public final void f(Bundle paramBundle)
  {
    super.f(paramBundle);
  }
  
  public final void m()
  {
    super.m();
    fey localfey = this.a;
    localfey.a(null, new eux(localfey));
  }
  
  public final void n()
  {
    fey localfey = this.a;
    if (localfey.a != null) {
      localfey.a.b();
    }
    for (;;)
    {
      super.n();
      return;
      localfey.a(5);
    }
  }
  
  public final void o()
  {
    fey localfey = this.a;
    if (localfey.a != null) {
      localfey.a.d();
    }
    for (;;)
    {
      super.o();
      return;
      localfey.a(1);
    }
  }
  
  public void onLowMemory()
  {
    fey localfey = this.a;
    if (localfey.a != null) {
      localfey.a.e();
    }
    super.onLowMemory();
  }
  
  @Deprecated
  public final fel v()
  {
    ffj localffj = w();
    if (localffj == null) {}
    for (;;)
    {
      return null;
      try
      {
        ffd localffd = localffj.a();
        if (localffd == null) {
          continue;
        }
        if ((this.b == null) || (this.b.a.asBinder() != localffd.asBinder())) {
          this.b = new fel(localffd);
        }
        return this.b;
      }
      catch (RemoteException localRemoteException)
      {
        throw new bm(localRemoteException);
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fev
 * JD-Core Version:    0.7.0.1
 */