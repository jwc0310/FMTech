import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.libraries.social.help.TooltipView;
import java.util.List;
import java.util.Set;

public final class hnw
  extends gpe
  implements hrf
{
  TooltipView Z;
  private int aa;
  private hnu ab;
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = super.a(paramLayoutInflater, paramViewGroup, paramBundle);
    if (localView != null)
    {
      this.Z = ((TooltipView)localView.findViewById(efj.Jk));
      this.Z.setVisibility(8);
    }
    return localView;
  }
  
  protected final hrg a(hrh paramhrh)
  {
    hrg localhrg = super.a(paramhrh);
    if (!"Clx".equals(paramhrh.a())) {
      return localhrg;
    }
    if ((localhrg != null) && (localhrg.size() > 0) && ((localhrg.get(0) instanceof hnu)))
    {
      this.ab = ((hnu)localhrg.get(0));
      this.ab.a.add(this);
    }
    return localhrg;
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.aa = this.m.getInt("ShareouselSlide.ARG_SHAREOUSEL_TOOLTIP", -1);
  }
  
  public final void aL_()
  {
    this.ab.a.remove(this);
    if (this.Z == null) {}
    label313:
    label358:
    do
    {
      return;
      if (this.ab.x() == 1)
      {
        hnx localhnx = new hnx(this);
        iee localiee = (iee)mbb.a(this.bn, iee.class);
        int i = ((git)mbb.a(this.bn, git.class)).c();
        ied localied;
        TooltipView localTooltipView;
        int j;
        if (this.aa != -1)
        {
          mbf localmbf = this.bn;
          int k = this.aa;
          if (k != pkh.L.a) {
            throw new IllegalStateException(35 + "Invalid IPH TooltipId = " + k);
          }
          String str1 = localmbf.getResources().getString(efj.Jo);
          String str2 = localmbf.getResources().getString(efj.Ex);
          Intent localIntent = ((hpo)mbb.a(localmbf, hpo.class)).c(i);
          localied = new ied(i, pkh.L, str1, str2, 3);
          localied.f = localmbf.getString(efj.Jp);
          localied.g = localIntent;
          if ((localied != null) && (localiee.a(localied)))
          {
            this.Z.c(g().getDimensionPixelSize(efj.Jj));
            this.Z.a(localied);
            this.Z.e.add(localhnx);
            localTooltipView = this.Z;
            efj.e(localTooltipView, "Attempted to register null TooltipView");
            localTooltipView.e.add(localiee);
            if (localTooltipView.getTag(efj.MH) == null) {
              break label358;
            }
            j = 1;
            if ((j == 0) && (localTooltipView.getTag(efj.MI) == null)) {
              break label428;
            }
          }
        }
        for (;;)
        {
          ((FrameLayout.LayoutParams)this.Z.getLayoutParams()).gravity = 1;
          this.Z.setVisibility(0);
          return;
          localied = null;
          break;
          lvj locallvj = (lvj)mbb.b(localTooltipView.getContext(), lvj.class);
          if (locallvj != null)
          {
            ief localief = new ief(localiee, localTooltipView);
            locallvj.a.a.add(localief);
            localTooltipView.setTag(efj.MH, localief);
            j = 1;
            break label313;
          }
          j = 0;
          break label313;
          localTooltipView.setTag(efj.MI, Long.valueOf(localiee.a.a()));
        }
      }
    } while (this.Z.getVisibility() != 0);
    label428:
    this.Z.a(true);
  }
  
  protected final int v()
  {
    return efj.Jl;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hnw
 * JD-Core Version:    0.7.0.1
 */