import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.plus.fragments.CirclesMultipleSelectFragment;
import java.util.ArrayList;

public final class bxs
  extends ra
{
  public bxs(CirclesMultipleSelectFragment paramCirclesMultipleSelectFragment, Context paramContext)
  {
    super(paramContext, null, 0);
  }
  
  public final View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    hgl localhgl = new hgl(paramContext);
    localhgl.a(false);
    localhgl.c(true);
    localhgl.z = this.f;
    return localhgl;
  }
  
  public final void a(View paramView, Context paramContext, Cursor paramCursor)
  {
    hgl localhgl = (hgl)paramView;
    String str = paramCursor.getString(1);
    localhgl.a(str, -3, paramCursor.getString(2), paramCursor.getInt(6), aau.a(paramContext, this.f.ad.c(), -3));
    localhgl.setChecked(this.f.Z.contains(str));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bxs
 * JD-Core Version:    0.7.0.1
 */