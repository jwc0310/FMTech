import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.social.avatars.ui.AvatarView;

final class hik
  extends ra
{
  private final LayoutInflater g;
  
  public hik(hij paramhij, Context paramContext)
  {
    super(paramContext, null, 0);
    this.g = LayoutInflater.from(paramContext);
  }
  
  public final View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    return this.g.inflate(ehr.aS, paramViewGroup, false);
  }
  
  public final void a(View paramView, Context paramContext, Cursor paramCursor)
  {
    String str = paramCursor.getString(paramCursor.getColumnIndexOrThrow("gaia_id"));
    ((TextView)paramView.findViewById(ehr.aC)).setText(paramCursor.getString(paramCursor.getColumnIndexOrThrow("name")));
    ((AvatarView)paramView.findViewById(ehr.aB)).a(str, paramCursor.getString(paramCursor.getColumnIndexOrThrow("photo_url")));
    paramView.setOnClickListener(new gxn(new hil(this, str)));
    efj.a(paramView, new kvk(pjn.g, str));
    hij localhij = this.f;
    int i = paramCursor.getPosition();
    if ((i > 0) && (!TextUtils.isEmpty(localhij.d)) && (i >= -6 + localhij.b.getCount()))
    {
      hld.a(localhij.bn, localhij.c, localhij.Z, localhij.a, false, localhij.d);
      localhij.v();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hik
 * JD-Core Version:    0.7.0.1
 */