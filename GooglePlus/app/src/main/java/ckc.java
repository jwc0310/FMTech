import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.social.discovery.views.PeopleListRowAsCardView;
import com.google.android.libraries.social.discovery.views.PeopleListRowView;
import java.util.ArrayList;
import java.util.Arrays;

public class ckc
  extends ckb
{
  private ArrayList a;
  private ArrayList<odg> b;
  private ors[] c;
  private int d;
  
  protected ckc(cjx paramcjx)
  {
    super(paramcjx);
  }
  
  public final void a()
  {
    if (this.b != null) {
      cll.a(this.b);
    }
    notifyDataSetChanged();
    cjx localcjx = this.e;
    localcjx.J();
  }
  
  public final void a(ArrayList<odg> paramArrayList, int paramInt)
  {
    this.b = paramArrayList;
    this.a = paramArrayList;
    this.c = null;
    this.d = paramInt;
  }
  
  public final void a(ors[] paramArrayOfors, int paramInt)
  {
    this.c = paramArrayOfors;
    this.a = new ArrayList(Arrays.asList(paramArrayOfors));
    this.d = paramInt;
  }
  
  public int getCount()
  {
    if (this.a == null) {
      return 0;
    }
    return this.a.size();
  }
  
  public Object getItem(int paramInt)
  {
    if (this.a == null) {
      return null;
    }
    return this.a.get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return 0L;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    PeopleListRowAsCardView localPeopleListRowAsCardView;
    Object localObject;
    if (paramView == null)
    {
      localPeopleListRowAsCardView = (PeopleListRowAsCardView)this.e.a_(null).inflate(this.e.af_(), null);
      localObject = getItem(paramInt);
      String str = cjx.a(localObject);
      if ((str == null) || (TextUtils.equals(this.e.am.f().b("gaia_id"), str))) {
        break label189;
      }
    }
    label189:
    for (boolean bool = true;; bool = false)
    {
      PeopleListRowView localPeopleListRowView = (PeopleListRowView)localPeopleListRowAsCardView.h;
      localPeopleListRowView.a(this.e, this.e.ag, true);
      if (this.e.aj) {
        localPeopleListRowView.a = true;
      }
      localPeopleListRowView.k = bool;
      localPeopleListRowView.a(localObject, this.e.ai, this.e.ak);
      localPeopleListRowView.setOnClickListener(this.e);
      localPeopleListRowView.g = this.d;
      localPeopleListRowView.h = null;
      localPeopleListRowAsCardView.a();
      return localPeopleListRowAsCardView;
      localPeopleListRowAsCardView = (PeopleListRowAsCardView)paramView;
      break;
    }
  }
  
  public boolean isEmpty()
  {
    return (this.a == null) || (this.a.isEmpty());
  }
  
  public boolean isEnabled(int paramInt)
  {
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ckc
 * JD-Core Version:    0.7.0.1
 */