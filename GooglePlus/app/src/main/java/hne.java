import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.Toast;
import com.google.android.libraries.social.ui.views.imagetextbutton.ImageTextButton;
import java.util.ArrayList;

public final class hne
  extends mca
  implements View.OnClickListener, gzi, luu
{
  private int Z;
  private gzj a;
  private int aa;
  private int b;
  private hot c;
  private CheckBox d;
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = LayoutInflater.from(this.bn).inflate(efj.IE, paramViewGroup, false);
    ((ImageTextButton)localView.findViewById(da.a)).setOnClickListener(this);
    ((ImageTextButton)localView.findViewById(da.g)).setOnClickListener(this);
    this.d = ((CheckBox)localView.findViewById(da.h));
    this.Z = this.c.d(this.b);
    if (this.c.b(this.b)) {}
    for (int i = 2;; i = 0)
    {
      this.aa = i;
      CheckBox localCheckBox = this.d;
      int j = this.Z;
      boolean bool = false;
      if (j == 2) {
        bool = true;
      }
      localCheckBox.setChecked(bool);
      return localView;
    }
  }
  
  public final void a(int paramInt, Bundle paramBundle, String paramString) {}
  
  public final void a(int paramInt, boolean paramBoolean, Bundle paramBundle, String paramString) {}
  
  public final void a(Bundle paramBundle, String paramString)
  {
    if ("quit_edit_followed_collexions_visibility".equals(paramString))
    {
      f().setResult(0);
      f().finish();
    }
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    if ((paramhae == null) || (!"UpdateCollectorSettingsTask".equals(paramString)) || (paramhae.a().getBoolean("trigger_follow_state_update", false))) {
      return;
    }
    if (paramhae.b != 200) {}
    for (int i = 1; i != 0; i = 0)
    {
      Toast.makeText(this.bn, this.bn.getString(efj.II), 0).show();
      return;
    }
    f().setResult(-1);
    f().finish();
  }
  
  public final void b(Bundle paramBundle, String paramString) {}
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.a = ((gzj)this.bo.a(gzj.class));
    this.a.a.add(this);
    this.c = ((hot)this.bo.a(hot.class));
    this.b = ((git)this.bo.a(git.class)).c();
  }
  
  public final void c(Bundle paramBundle, String paramString) {}
  
  public final void onClick(View paramView)
  {
    int i = 2;
    int j = 1;
    int k = paramView.getId();
    if (k == da.a) {
      if (this.Z != 0) {
        if (this.d.isChecked())
        {
          if (i == this.Z) {
            break label151;
          }
          if (j == 0) {
            break label156;
          }
          n = efj.IF;
          str1 = g().getString(n);
          i1 = efj.IH;
          str2 = g().getString(i1);
          i2 = efj.IJ;
          str3 = g().getString(i2);
          i3 = efj.IG;
          locallut = lut.a(str1, str2, str3, g().getString(i3), 0, 0);
          locallut.n = this;
          locallut.p = 0;
          locallut.a(h(), "quit_edit_followed_collexions_visibility");
        }
      }
    }
    label151:
    label156:
    while (k != da.g)
    {
      for (;;)
      {
        int n;
        String str1;
        int i1;
        String str2;
        int i2;
        String str3;
        int i3;
        lut locallut;
        return;
        i = j;
        continue;
        j = 0;
      }
      f().setResult(0);
      f().finish();
      return;
    }
    int m;
    if (this.d.isChecked())
    {
      m = i;
      if (m == this.Z) {
        break label243;
      }
    }
    for (;;)
    {
      if (j == 0) {
        break label248;
      }
      hlr localhlr = new hlr(this.b, this.aa, null, m, false);
      this.a.c(localhlr);
      return;
      m = j;
      break;
      label243:
      j = 0;
    }
    label248:
    f().setResult(0);
    f().finish();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hne
 * JD-Core Version:    0.7.0.1
 */