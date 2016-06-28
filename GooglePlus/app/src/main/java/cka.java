import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.social.discovery.views.PeopleListRowView;

public final class cka
  extends ckc
{
  protected cka(cjx paramcjx)
  {
    super(paramcjx);
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    boolean bool = true;
    PeopleListRowView localPeopleListRowView;
    Object localObject;
    if (paramView == null)
    {
      localPeopleListRowView = (PeopleListRowView)this.a.a_(null).inflate(efj.th, null);
      localObject = getItem(paramInt);
      String str1 = cjx.a(localObject);
      localPeopleListRowView.a(this.a, null, bool);
      if (this.a.aj) {
        localPeopleListRowView.a = bool;
      }
      localPeopleListRowView.a(bool);
      if ((str1 == null) || (TextUtils.equals(this.a.am.f().b("gaia_id"), str1))) {
        break label228;
      }
    }
    StringBuilder localStringBuilder;
    for (;;)
    {
      localPeopleListRowView.k = bool;
      if (!(localObject instanceof ors)) {
        break label382;
      }
      osf[] arrayOfosf = ((ors)localObject).c;
      if ((arrayOfosf == null) || (arrayOfosf.length <= 0)) {
        break label382;
      }
      localStringBuilder = new StringBuilder();
      for (int j = 0; j < arrayOfosf.length; j++)
      {
        osf localosf = arrayOfosf[j];
        if ((localosf.a != null) && (localosf.a.b != null))
        {
          localStringBuilder.append(localosf.a.b);
          localStringBuilder.append('|');
        }
      }
      localPeopleListRowView = (PeopleListRowView)paramView;
      break;
      label228:
      bool = false;
    }
    localStringBuilder.setLength(-1 + localStringBuilder.length());
    label375:
    label382:
    for (String str2 = this.a.ag.a(localStringBuilder.toString()).toString();; str2 = null)
    {
      View localView;
      int i;
      if (!TextUtils.isEmpty(str2))
      {
        localPeopleListRowView.a((ors)localObject, str2, null, null, this.a.ak);
        localPeopleListRowView.setOnClickListener(this.a);
        localPeopleListRowView.g = this.a.ao;
        localPeopleListRowView.h = null;
        localView = localPeopleListRowView.findViewById(aaw.cD);
        i = 0;
        if (paramInt == 0) {
          break label375;
        }
      }
      for (;;)
      {
        localView.setVisibility(i);
        return localPeopleListRowView;
        localPeopleListRowView.a(localObject, this.a.ai, this.a.ak);
        break;
        i = 8;
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cka
 * JD-Core Version:    0.7.0.1
 */