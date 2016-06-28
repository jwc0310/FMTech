import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.widget.ListView;
import com.google.android.libraries.social.settings.PreferenceScreen;
import java.util.ArrayList;
import java.util.List;

public class kfb
  extends bk
  implements kfn
{
  ListView Z;
  private boolean a;
  private final Runnable aa = new kfd(this);
  private View.OnKeyListener ab = new kfe(this);
  private boolean b;
  private Handler c = new kfc(this);
  public kfk d;
  
  public View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    return paramLayoutInflater.inflate(az.A, paramViewGroup, false);
  }
  
  public void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.a(paramInt1, paramInt2, paramIntent);
    synchronized (this.d)
    {
      if (???.d == null) {
        return;
      }
      ArrayList localArrayList = new ArrayList(???.d);
      int i = localArrayList.size();
      int j = 0;
      if ((j < i) && (!((kfm)localArrayList.get(j)).a(paramInt1, paramIntent))) {
        j++;
      }
    }
  }
  
  public void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.d = new kfk(f(), 100);
    this.d.b = this;
  }
  
  public final void a(PreferenceScreen paramPreferenceScreen)
  {
    kfk localkfk = this.d;
    if (paramPreferenceScreen != localkfk.c) {
      localkfk.c = paramPreferenceScreen;
    }
    for (int i = 1;; i = 0)
    {
      if ((i != 0) && (paramPreferenceScreen != null))
      {
        this.a = true;
        if ((this.b) && (!this.c.hasMessages(1))) {
          this.c.obtainMessage(1).sendToTarget();
        }
      }
      return;
    }
  }
  
  public final boolean a(ket paramket)
  {
    if ((paramket.u != null) && ((f() instanceof kff))) {
      return ((kff)f()).a();
    }
    return false;
  }
  
  public void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    if (this.a) {
      w();
    }
    this.b = true;
    if (paramBundle != null)
    {
      Bundle localBundle = paramBundle.getBundle("settings:preferences");
      if (localBundle != null)
      {
        PreferenceScreen localPreferenceScreen = this.d.c;
        if (localPreferenceScreen != null) {
          localPreferenceScreen.c(localBundle);
        }
      }
    }
  }
  
  public void d_()
  {
    this.Z = null;
    this.c.removeCallbacks(this.aa);
    this.c.removeMessages(1);
    super.d_();
  }
  
  public void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    PreferenceScreen localPreferenceScreen = this.d.c;
    if (localPreferenceScreen != null)
    {
      Bundle localBundle = new Bundle();
      localPreferenceScreen.b(localBundle);
      paramBundle.putBundle("settings:preferences", localBundle);
    }
  }
  
  public void o()
  {
    for (;;)
    {
      synchronized (this.d)
      {
        if (???.e == null) {
          break label86;
        }
        localArrayList = new ArrayList(???.e);
        if (localArrayList != null)
        {
          int i = localArrayList.size();
          int j = 0;
          if (j < i)
          {
            ((kfl)localArrayList.get(j)).d();
            j++;
          }
        }
      }
      ???.d();
      super.o();
      return;
      label86:
      ArrayList localArrayList = null;
    }
  }
  
  public void p_()
  {
    super.p_();
    this.d.g = this;
  }
  
  public void q_()
  {
    super.q_();
    synchronized (this.d)
    {
      this.d.g = null;
    }
    throw localObject;
  }
  
  final void w()
  {
    PreferenceScreen localPreferenceScreen = this.d.c;
    if (localPreferenceScreen != null)
    {
      if (this.Z == null)
      {
        View localView1 = this.N;
        if (localView1 == null) {
          throw new IllegalStateException("Content view not yet created");
        }
        View localView2 = localView1.findViewById(16908298);
        if (!(localView2 instanceof ListView)) {
          throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
        }
        this.Z = ((ListView)localView2);
        if (this.Z == null) {
          throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
        }
        this.Z.setOnKeyListener(this.ab);
        this.c.post(this.aa);
      }
      localPreferenceScreen.a(this.Z);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kfb
 * JD-Core Version:    0.7.0.1
 */