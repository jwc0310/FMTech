import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.libraries.social.avatars.ui.AvatarView;
import com.google.android.libraries.social.socialcast.impl.CastService;
import com.google.android.libraries.social.socialcast.impl.SocialCastMediaView;

public final class kwt
  extends mca
{
  private static final gxq Z = new gxq(pke.e);
  private static final gxq aa = new gxq(pke.g);
  private static final gxq ab = new gxq(pke.j);
  private static final gxq ac = new gxq(pke.h);
  private static final gxq ad = new gxq(pke.d);
  private static final gxq d = new gxq(pke.f);
  final kww a = new kww(this);
  private final kwx ae = new kwx(this);
  private ImageButton af;
  private TextView ag;
  private ImageButton ah;
  private ImageButton ai;
  private AvatarView aj;
  private TextView ak;
  private TextView al;
  private View am;
  private View an;
  private View ao;
  private Runnable ap;
  kwd b;
  SocialCastMediaView c;
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = LayoutInflater.from(this.bn).inflate(efj.VR, paramViewGroup, false);
    this.an = localView.findViewById(eyg.bl);
    this.am = localView.findViewById(eyg.bD);
    this.ao = localView.findViewById(eyg.bn);
    this.af = ((ImageButton)localView.findViewById(eyg.bw));
    this.ag = ((TextView)localView.findViewById(eyg.bp));
    this.ah = ((ImageButton)localView.findViewById(eyg.by));
    this.ai = ((ImageButton)localView.findViewById(eyg.bt));
    this.c = ((SocialCastMediaView)localView.findViewById(eyg.bq));
    this.aj = ((AvatarView)localView.findViewById(eyg.bj));
    this.ak = ((TextView)localView.findViewById(eyg.bk));
    this.al = ((TextView)localView.findViewById(eyg.bx));
    kwv localkwv = new kwv(this);
    efj.a(this.ah, ac);
    efj.a(this.ai, ad);
    efj.a(this.af, Z);
    efj.a(this.ag, aa);
    gxn localgxn = new gxn(localkwv);
    this.af.setOnClickListener(localgxn);
    this.ag.setOnClickListener(localgxn);
    this.ah.setOnClickListener(localgxn);
    this.ai.setOnClickListener(localgxn);
    return localView;
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.ap = new kwu(this);
  }
  
  final void a(boolean paramBoolean)
  {
    ImageButton localImageButton1 = this.ah;
    int i;
    int j;
    label53:
    ImageButton localImageButton3;
    int k;
    if ((this.b.e()) && (paramBoolean))
    {
      i = 0;
      localImageButton1.setVisibility(i);
      ImageButton localImageButton2 = this.ai;
      if ((!this.b.d()) || (!paramBoolean)) {
        break label86;
      }
      j = 0;
      localImageButton2.setVisibility(j);
      localImageButton3 = this.af;
      k = 0;
      if (!paramBoolean) {
        break label92;
      }
    }
    for (;;)
    {
      localImageButton3.setVisibility(k);
      return;
      i = 4;
      break;
      label86:
      j = 4;
      break label53;
      label92:
      k = 4;
    }
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
  }
  
  public final void o()
  {
    if (this.b != null)
    {
      this.b.b(this.a);
      this.b = null;
    }
    f().unbindService(this.ae);
    Runnable localRunnable = this.ap;
    efj.m().removeCallbacks(localRunnable);
    super.o();
  }
  
  public final void p_()
  {
    super.p_();
    f().bindService(new Intent(f(), CastService.class), this.ae, 1);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kwt
 * JD-Core Version:    0.7.0.1
 */