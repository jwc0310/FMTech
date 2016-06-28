import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.social.discovery.views.PeopleListRowView;
import java.util.Set;

public final class bys
  extends hqi
{
  public bys(byl parambyl, Context paramContext, Cursor paramCursor)
  {
    super(paramContext, null);
  }
  
  public final View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    return this.f.a_(null).inflate(efj.th, null);
  }
  
  public final void a(View paramView, Context paramContext, Cursor paramCursor)
  {
    PeopleListRowView localPeopleListRowView = (PeopleListRowView)paramView;
    boolean bool1;
    int i;
    label104:
    boolean bool2;
    label118:
    boolean bool3;
    label132:
    String str5;
    String str6;
    String str4;
    label147:
    View localView;
    int k;
    if (paramCursor.getInt(7) == 1)
    {
      bool1 = true;
      localPeopleListRowView.a(this.f, this.f.ag, bool1);
      localPeopleListRowView.a(true);
      String str1 = paramCursor.getString(1);
      String str2 = paramCursor.getString(11);
      String str3 = paramCursor.getString(2);
      if ((paramCursor.getInt(9) == 0) && (!this.f.aa.contains(str1))) {
        break label226;
      }
      i = 1;
      if (paramCursor.getInt(13) == 0) {
        break label232;
      }
      bool2 = true;
      if (paramCursor.getInt(10) == 0) {
        break label238;
      }
      bool3 = true;
      if (i == 0) {
        break label244;
      }
      str5 = "15";
      str6 = null;
      str4 = null;
      localPeopleListRowView.a(str1, str2, str4, str3, str6, false, str5, null, bool2, bool3, this.f.ak);
      localPeopleListRowView.setOnClickListener(this.f);
      localView = localPeopleListRowView.findViewById(aaw.cD);
      int j = paramCursor.getPosition();
      k = 0;
      if (j == 0) {
        break label288;
      }
    }
    for (;;)
    {
      localView.setVisibility(k);
      return;
      bool1 = false;
      break;
      label226:
      i = 0;
      break label104;
      label232:
      bool2 = false;
      break label118;
      label238:
      bool3 = false;
      break label132;
      label244:
      str4 = hdo.b(paramCursor.getString(5));
      str5 = paramCursor.getString(12);
      str6 = this.f.ag.a(str5).toString();
      break label147;
      label288:
      k = 8;
    }
  }
  
  public final boolean isEnabled(int paramInt)
  {
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bys
 * JD-Core Version:    0.7.0.1
 */