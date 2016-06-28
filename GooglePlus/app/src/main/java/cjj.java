import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.social.discovery.views.PeopleListRowAsCardView;
import com.google.android.libraries.social.discovery.views.PeopleListRowView;

public final class cjj
  extends hqi
{
  public cjj(cjd paramcjd, Context paramContext, Cursor paramCursor)
  {
    super(paramContext, null);
  }
  
  public final View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    return this.f.a_(null).inflate(efj.vw, null);
  }
  
  public final void a(View paramView, Context paramContext, Cursor paramCursor)
  {
    PeopleListRowAsCardView localPeopleListRowAsCardView = (PeopleListRowAsCardView)paramView;
    boolean bool1;
    PeopleListRowView localPeopleListRowView;
    String str1;
    String str2;
    String str3;
    int i;
    label91:
    boolean bool2;
    label105:
    boolean bool3;
    label119:
    String str5;
    String str4;
    if (paramCursor.getInt(7) == 1)
    {
      bool1 = true;
      localPeopleListRowView = (PeopleListRowView)localPeopleListRowAsCardView.h;
      localPeopleListRowView.a(this.f, this.f.ag, bool1);
      str1 = paramCursor.getString(1);
      str2 = paramCursor.getString(11);
      str3 = paramCursor.getString(2);
      if (paramCursor.getInt(9) == 0) {
        break label203;
      }
      i = 1;
      if (paramCursor.getInt(13) == 0) {
        break label209;
      }
      bool2 = true;
      if (paramCursor.getInt(10) == 0) {
        break label215;
      }
      bool3 = true;
      if (i == 0) {
        break label221;
      }
      str5 = "15";
      str4 = null;
      label131:
      if (!bool2) {
        break label246;
      }
    }
    label203:
    label209:
    label215:
    label221:
    label246:
    for (String str6 = this.f.ai;; str6 = null)
    {
      localPeopleListRowView.a(str1, str2, str4, str3, str6, false, str5, null, bool2, bool3, this.f.ak);
      localPeopleListRowView.setOnClickListener(this.f);
      paramCursor.getPosition();
      localPeopleListRowAsCardView.a();
      return;
      bool1 = false;
      break;
      i = 0;
      break label91;
      bool2 = false;
      break label105;
      bool3 = false;
      break label119;
      str4 = hdo.b(paramCursor.getString(5));
      str5 = paramCursor.getString(12);
      break label131;
    }
  }
  
  public final boolean isEnabled(int paramInt)
  {
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cjj
 * JD-Core Version:    0.7.0.1
 */