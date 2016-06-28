import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.plus.service.EsService;
import com.google.android.libraries.social.sharekit.comments.MentionMultiAutoCompleteTextView;

final class bae
  implements View.OnClickListener
{
  bae(baa parambaa) {}
  
  public final void onClick(View paramView)
  {
    if (this.a.ae.c())
    {
      this.a.aa.a(gxz.Q);
      int i = this.a.b.c();
      String str1 = kia.a(this.a.ae.getText());
      String str2 = this.a.m.getString("view_id");
      bcp localbcp = this.a.ab.b;
      baa localbaa = this.a;
      bp localbp = this.a.f();
      String str3 = localbcp.j();
      long l = localbcp.o();
      String str4 = localbcp.k();
      Intent localIntent = EsService.e.a(localbp, EsService.class);
      localIntent.putExtra("op", 86);
      localIntent.putExtra("account_id", i);
      localIntent.putExtra("gaia_id", str3);
      localIntent.putExtra("photo_id", l);
      localIntent.putExtra("tile_id", str4);
      localIntent.putExtra("view_id", str2);
      localIntent.putExtra("text", str1);
      localIntent.putExtra("auth_key", null);
      localbaa.af = Integer.valueOf(EsService.a(localbp, localIntent));
      bz localbz = this.a.x;
      coo.a(null, this.a.f().getString(aau.po), false).a(localbz, "ProgressDialogHelper:progress_dialog");
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bae
 * JD-Core Version:    0.7.0.1
 */