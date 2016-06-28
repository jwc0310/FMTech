import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.social.discovery.views.PeopleListRowAsCardView;
import com.google.android.libraries.social.discovery.views.PeopleListRowView;

final class cjs
  extends hqi
{
  public cjs(cjq paramcjq, Context paramContext, Cursor paramCursor)
  {
    super(paramContext, null);
  }
  
  public final View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    return this.f.a_(null).inflate(efj.vw, null);
  }
  
  public final void a(View paramView, Context paramContext, Cursor paramCursor)
  {
    int i = 1;
    PeopleListRowAsCardView localPeopleListRowAsCardView = (PeopleListRowAsCardView)paramView;
    PeopleListRowView localPeopleListRowView = (PeopleListRowView)localPeopleListRowAsCardView.h;
    localPeopleListRowView.a(this.f, this.f.ag, i);
    String str1 = paramCursor.getString(i);
    String str2 = paramCursor.getString(2);
    String str3 = paramCursor.getString(3);
    String str4;
    String str5;
    if (paramCursor.getInt(6) != 0)
    {
      str4 = hdo.b(paramCursor.getString(5));
      str5 = paramCursor.getString(4);
      if (i == 0) {
        break label168;
      }
    }
    label168:
    for (String str6 = this.f.ai;; str6 = null)
    {
      localPeopleListRowView.a(str1, str2, str4, str3, str6, false, str5, null, i, false, this.f.ak);
      localPeopleListRowView.setOnClickListener(this.f);
      paramCursor.isFirst();
      localPeopleListRowAsCardView.a();
      return;
      int j = 0;
      break;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cjs
 * JD-Core Version:    0.7.0.1
 */