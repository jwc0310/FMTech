import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.ClipboardManager;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.Toast;
import com.google.android.libraries.social.sharekit.impl.CommentBoxFragment;
import com.google.android.libraries.social.sharekit.impl.ComposedContentFragment;
import java.util.ArrayList;
import java.util.List;

final class klk
  implements View.OnClickListener
{
  klk(klg paramklg) {}
  
  public final void onClick(View paramView)
  {
    int i = paramView.getId();
    int j;
    if ((i == aau.Bd) || (i == aau.AZ)) {
      if (!this.a.E.a.isEmpty())
      {
        j = 1;
        if (j != 0)
        {
          this.a.E.c = 2;
          Toast.makeText(this.a.f, et.o, 1).show();
        }
        this.a.a(1);
      }
    }
    label242:
    do
    {
      do
      {
        return;
        j = 0;
        break;
        if (i == aau.Bi)
        {
          boolean bool2;
          boolean bool3;
          boolean bool4;
          int m;
          if ((this.a.s) || (this.a.t) || (this.a.u))
          {
            bool2 = true;
            bool3 = this.a.t;
            bool4 = efj.z(this.a.f.getBaseContext(), this.a.O);
            if (this.a.S == null) {
              break label769;
            }
            kmb localkmb1 = this.a.S;
            gnb localgnb1 = gnb.a(this.a.M.c);
            kl localkl1 = this.a.a;
            kl localkl2 = this.a.b;
            kl localkl3 = this.a.c;
            if (localkmb1.a.a(localgnb1, localkl1, localkl2, localkl3, bool2, bool3).length <= 0) {
              break label622;
            }
            m = 1;
          }
          for (;;)
          {
            if (m != 0)
            {
              if ((bool4) && (this.a.T) && (this.a.U != null) && (this.a.U.size() > 0))
              {
                klg.a(this.a, this.a.U);
                this.a.q.b(new kmp(this.a.O, this.a.U));
              }
              kmb localkmb2 = this.a.S;
              bp localbp = this.a.f;
              int n = this.a.n.getWidth();
              gnb localgnb2 = gnb.a(this.a.M.c);
              kl localkl4 = this.a.a;
              kl localkl5 = this.a.b;
              kl localkl6 = this.a.c;
              gxr localgxr = new gxr();
              gxq localgxq = new gxq(pkd.o);
              localgxr.b.add(localgxq);
              new gwz(4, localgxr.a(localbp)).b(localbp);
              localkmb2.e.a.removeAllViews();
              int i1 = localkmb2.f.getColor(aw.dD);
              int i2 = localkmb2.f.getColor(aw.dE);
              if ((localgnb2 != null) && (!localgnb2.b())) {
                localkmb2.a(localgnb2, localgnb2.a(localbp), i1, true, localkmb2.e.a, localkmb2.d);
              }
              gnb[] arrayOfgnb = localkmb2.a.a(localgnb2, localkl4, localkl5, localkl6, bool2, bool3);
              int i3 = arrayOfgnb.length;
              int i4 = 0;
              for (;;)
              {
                if (i4 < i3)
                {
                  gnb localgnb3 = arrayOfgnb[i4];
                  localkmb2.a(localgnb3, localgnb3.a(localbp), i1, false, localkmb2.e.a, localkmb2.d);
                  i4++;
                  continue;
                  bool2 = false;
                  break;
                  m = 0;
                  break label242;
                }
              }
              localkmb2.a(null, localkmb2.f.getString(et.a), i2, false, localkmb2.e.a, localkmb2.d);
              localkmb2.b.setOutsideTouchable(true);
              localkmb2.b.setTouchable(true);
              localkmb2.b.setFocusable(true);
              if (n > 0) {
                localkmb2.b.setWidth((int)(0.65F * n));
              }
              if (Build.VERSION.SDK_INT >= 21) {}
              for (int i5 = 1;; i5 = 0)
              {
                if (i5 != 0)
                {
                  int i6 = localbp.getResources().getDimensionPixelSize(efj.Uy);
                  localkmb2.b.setElevation(i6);
                }
                localkmb2.b.showAsDropDown(localkmb2.c);
                return;
              }
            }
          }
          this.a.k();
          return;
        }
        if (i == aau.Be)
        {
          this.a.n();
          return;
        }
        if (i == aau.Ba)
        {
          klg localklg2 = this.a;
          boolean bool1 = TextUtils.isEmpty(localklg2.E.d);
          localklg2.N = 1;
          lvb locallvb = new lvb();
          String str1 = localklg2.f.getString(et.f);
          locallvb.a.putString("dialog_title", str1);
          String str2 = localklg2.E.d;
          locallvb.a.putString("text_value", str2);
          String str3 = localklg2.f.getString(et.f);
          locallvb.a.putString("hint_text", str3);
          if (bool1) {}
          for (int k = et.g;; k = et.t)
          {
            locallvb.a.putInt("cancel_resource_id", k);
            luy localluy = locallvb.a();
            localluy.n = localklg2.L;
            localluy.p = 0;
            localluy.a(localklg2.f.b.a.d, "SharekitAlbumName");
            return;
          }
        }
        if ((i != aau.Bk) && (i != aau.Bl) && (i != aau.Bm) && (i != aau.Bn)) {
          break label1063;
        }
      } while (this.a.L.a.N.getVisibility() == 8);
      klg.a(this.a);
      this.a.a(0);
      this.a.L.a.w();
      return;
      if (i == aau.Bc)
      {
        ClipboardManager localClipboardManager = (ClipboardManager)this.a.f.getSystemService("clipboard");
        this.a.a(localClipboardManager.getText(), null);
        return;
      }
      if (i == aau.Bx)
      {
        klg localklg1 = this.a;
        ImageView localImageView = (ImageView)localklg1.f.findViewById(aau.Bx);
        afv localafv = new afv(localImageView.getContext(), localImageView);
        localafv.a(efj.UT);
        localafv.a.findItem(aau.Br).setChecked(localklg1.F.a);
        localafv.a.findItem(aau.Bq).setChecked(localklg1.F.b);
        localafv.a.findItem(aau.By).setChecked(localklg1.F.c);
        localafv.a.findItem(aau.By).setVisible(false);
        localafv.c = new kll(localklg1);
        localafv.b.d();
        return;
      }
    } while (i != aau.BB);
    label622:
    this.a.a(0);
    label769:
    label1063:
    this.a.L.a.w();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     klk
 * JD-Core Version:    0.7.0.1
 */