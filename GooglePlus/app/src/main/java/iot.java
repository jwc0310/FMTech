import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.libraries.social.login.ui.CurrentAccountBannerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class iot
  implements mbo, mdp, mes, mfa, mfd
{
  public List<String> a = new ArrayList();
  CurrentAccountBannerView b;
  private final Activity c;
  private final int d;
  private boolean e;
  private FrameLayout f;
  private git g;
  
  public iot(Activity paramActivity, mek parammek, int paramInt)
  {
    this.c = paramActivity;
    this.d = paramInt;
    parammek.a(this);
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.g = ((git)parammbb.a(git.class));
  }
  
  public final void a(Bundle paramBundle)
  {
    if (paramBundle == null)
    {
      Iterator localIterator = this.a.iterator();
      if (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        if ((this.e) || (this.c.getIntent().getBooleanExtra(str, false))) {}
        for (boolean bool = true;; bool = false)
        {
          this.e = bool;
          break;
        }
      }
    }
    else
    {
      this.e = paramBundle.getBoolean("show_on_start");
    }
  }
  
  public final void b(Bundle paramBundle)
  {
    paramBundle.putBoolean("show_on_start", this.e);
  }
  
  public final void b_(Bundle paramBundle)
  {
    Activity localActivity;
    View localView;
    CurrentAccountBannerView localCurrentAccountBannerView;
    StringBuilder localStringBuilder;
    if (this.e)
    {
      int i = this.g.c();
      if (i != -1)
      {
        this.e = false;
        localActivity = this.c;
        if (this.f == null)
        {
          localView = this.c.findViewById(this.d);
          if (localView != null)
          {
            if (!(localView instanceof FrameLayout)) {
              break label388;
            }
            this.f = ((FrameLayout)localView);
          }
        }
        else
        {
          if (this.b == null)
          {
            this.b = ((CurrentAccountBannerView)LayoutInflater.from(localActivity).inflate(efj.OR, this.f, false));
            this.b.setVisibility(8);
            this.f.addView(this.b);
          }
          localCurrentAccountBannerView = this.b;
          gjb localgjb = ((giz)mbb.a(localCurrentAccountBannerView.getContext(), giz.class)).a(i);
          localCurrentAccountBannerView.a.setText(localgjb.b("display_name"));
          localCurrentAccountBannerView.b.setText(localgjb.b("account_name"));
          if (efj.C(localCurrentAccountBannerView.getContext()))
          {
            mfz localmfz = (mfz)mfx.a.get();
            localmfz.b = (1 + localmfz.b);
            if (localmfz.b != 1) {
              break label449;
            }
            localStringBuilder = localmfz.a;
            label234:
            if (localgjb.c("is_plus_page"))
            {
              CharSequence[] arrayOfCharSequence2 = new CharSequence[1];
              arrayOfCharSequence2[0] = localgjb.b("display_name");
              efj.a(localStringBuilder, arrayOfCharSequence2);
            }
            CharSequence[] arrayOfCharSequence1 = new CharSequence[1];
            arrayOfCharSequence1[0] = localgjb.b("account_name");
            efj.a(localStringBuilder, arrayOfCharSequence1);
            localCurrentAccountBannerView.c = mfx.b(localStringBuilder);
            if (!localCurrentAccountBannerView.d) {
              break label464;
            }
            localCurrentAccountBannerView.b();
          }
        }
      }
    }
    for (;;)
    {
      AlphaAnimation localAlphaAnimation = new AlphaAnimation(0.0F, 1.0F);
      localAlphaAnimation.setDuration(200L);
      localAlphaAnimation.setStartOffset(500L);
      this.b.setAnimation(localAlphaAnimation);
      this.b.setVisibility(0);
      iou localiou = new iou(this);
      efj.m().postDelayed(localiou, 3000L);
      return;
      label388:
      ViewGroup localViewGroup = (ViewGroup)localView.getParent();
      this.f = new FrameLayout(localActivity);
      ViewGroup.LayoutParams localLayoutParams = localView.getLayoutParams();
      localViewGroup.removeView(localView);
      localViewGroup.addView(this.f, localLayoutParams);
      this.f.addView(localView, -1, -1);
      break;
      label449:
      localStringBuilder = new StringBuilder(256);
      break label234;
      label464:
      localCurrentAccountBannerView.e = true;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iot
 * JD-Core Version:    0.7.0.1
 */