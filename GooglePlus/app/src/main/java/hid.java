import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.social.media.ui.MediaView;

final class hid
  extends agt
  implements View.OnClickListener
{
  hid(hic paramhic, View paramView)
  {
    super(paramView);
    paramView.setOnClickListener(new gxn(this));
  }
  
  public final void onClick(View paramView)
  {
    switch (hic.d(b()))
    {
    default: 
      ipf localipf = ((irm)this.a).t;
      this.p.c.a(localipf, this.a.getContentDescription());
      return;
    }
    isg localisg = this.p.c.b;
    irs localirs = new irs(localisg.b);
    int i = localisg.c.c();
    localirs.a.putExtra("account_id", i);
    localirs.a.putExtra("media_picker_mode", 3);
    localirs.a.putExtra("options", 1);
    Boolean localBoolean = Boolean.valueOf(true);
    localirs.a.putExtra("copy_content_uri_in_picker", localBoolean);
    Intent localIntent = localirs.a;
    localisg.a.a(efj.PL, localIntent);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hid
 * JD-Core Version:    0.7.0.1
 */