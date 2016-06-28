import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.plus.locations.FriendLocationsCircleFilterFragment;
import java.util.HashMap;
import java.util.HashSet;

public final class csj
  extends ra
{
  public csj(FriendLocationsCircleFilterFragment paramFriendLocationsCircleFilterFragment, Context paramContext)
  {
    super(paramContext, null, 0);
  }
  
  public final View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    hgl localhgl = new hgl(paramContext);
    localhgl.c(true);
    localhgl.a(false);
    localhgl.z = this.f;
    return localhgl;
  }
  
  public final void a(View paramView, Context paramContext, Cursor paramCursor)
  {
    hgl localhgl = (hgl)paramView;
    String str1 = paramCursor.getString(1);
    int i = paramCursor.getInt(4);
    localhgl.a(str1, i, paramCursor.getString(2), paramCursor.getInt(6), aau.a(paramContext, this.f.f().getIntent().getIntExtra("account_id", -1), i));
    localhgl.setChecked(this.f.a.contains(str1));
    Integer localInteger = (Integer)this.f.b.get(str1);
    int j;
    Resources localResources;
    if (localInteger == null)
    {
      j = 0;
      localResources = this.f.g();
      if (j != 0) {
        break label154;
      }
    }
    label154:
    int k;
    Object[] arrayOfObject;
    for (String str2 = localResources.getString(aau.dC);; str2 = localResources.getQuantityString(k, j, arrayOfObject))
    {
      localhgl.a(str2);
      return;
      j = localInteger.intValue();
      break;
      k = efj.xj;
      arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(j);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     csj
 * JD-Core Version:    0.7.0.1
 */