import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.social.discovery.views.PeopleListRowView;
import java.util.List;
import java.util.Map;

final class caj
  extends hqf
{
  private final LayoutInflater a;
  private final MatrixCursor b;
  
  public caj(cah paramcah, Context paramContext)
  {
    super(paramContext);
    this.a = LayoutInflater.from(paramContext);
    this.b = new MatrixCursor(new String[] { "UNUSED" });
    this.b.newRow();
    hqg localhqg1 = new hqg(false, false);
    if (this.aO >= this.aN.length)
    {
      hqg[] arrayOfhqg4 = new hqg[2 + this.aO];
      System.arraycopy(this.aN, 0, arrayOfhqg4, 0, this.aO);
      this.aN = arrayOfhqg4;
    }
    hqg[] arrayOfhqg1 = this.aN;
    int i = this.aO;
    this.aO = (i + 1);
    arrayOfhqg1[i] = localhqg1;
    this.aP = false;
    notifyDataSetChanged();
    hqg localhqg2 = new hqg(false, false);
    if (this.aO >= this.aN.length)
    {
      hqg[] arrayOfhqg3 = new hqg[2 + this.aO];
      System.arraycopy(this.aN, 0, arrayOfhqg3, 0, this.aO);
      this.aN = arrayOfhqg3;
    }
    hqg[] arrayOfhqg2 = this.aN;
    int j = this.aO;
    this.aO = (j + 1);
    arrayOfhqg2[j] = localhqg2;
    this.aP = false;
    notifyDataSetChanged();
  }
  
  public final int a()
  {
    return 2;
  }
  
  protected final int a(int paramInt1, int paramInt2)
  {
    return paramInt1;
  }
  
  protected final View a(Context paramContext, int paramInt1, Cursor paramCursor, int paramInt2, ViewGroup paramViewGroup)
  {
    switch (paramInt1)
    {
    default: 
      return null;
    case 0: 
      return this.a.inflate(efj.th, null);
    }
    return this.a.inflate(efj.us, null);
  }
  
  protected final void a(View paramView, int paramInt1, Cursor paramCursor, int paramInt2, ViewGroup paramViewGroup)
  {
    if ((paramInt2 > 0) && (!TextUtils.isEmpty(this.c.b)) && (paramInt2 >= -10 + getCount()) && (!this.c.d))
    {
      this.c.d = true;
      cxb localcxb = new cxb(this.c.bn, this.c.am.c(), this.c.b);
      this.c.ap.b(localcxb);
      a(true);
    }
    switch (paramInt1)
    {
    default: 
      return;
    }
    PeopleListRowView localPeopleListRowView = (PeopleListRowView)paramView;
    qwz localqwz = (qwz)hqv.a(new qwz(), paramCursor.getBlob(1));
    localPeopleListRowView.a(this.c, this.c.ag, false);
    localPeopleListRowView.a(true);
    String str1 = null;
    String str2 = null;
    String str6;
    String str7;
    String str5;
    boolean bool;
    Object localObject;
    String str3;
    String str4;
    if (localqwz != null)
    {
      str6 = localqwz.b;
      if (str6 != null)
      {
        str7 = jjf.b(str6);
        str5 = localqwz.c;
        bool = localqwz.f.booleanValue();
        if (!localqwz.e.booleanValue()) {
          break label316;
        }
        localObject = "15";
        str3 = str7;
        str4 = str6;
      }
    }
    for (;;)
    {
      localPeopleListRowView.a(str3, str4, str1, str5, str2, false, (String)localObject, null, bool, false, this.c.ak);
      localPeopleListRowView.setOnClickListener(this.c);
      View localView = localPeopleListRowView.findViewById(aaw.cD);
      if (paramCursor.getPosition() != 0) {}
      for (int i = 0;; i = 8)
      {
        localView.setVisibility(i);
        return;
        str7 = null;
        break;
        label316:
        if ((localqwz.d != null) && (localqwz.d.a != null))
        {
          str1 = localqwz.d.a.a;
          label348:
          if (this.c.a == null) {
            break label420;
          }
        }
        label420:
        for (String str8 = efj.h((List)this.c.a.get(str7));; str8 = null)
        {
          str2 = this.c.ag.a(str8).toString();
          localObject = str8;
          str3 = str7;
          str4 = str6;
          break;
          str1 = null;
          break label348;
        }
      }
      str3 = null;
      str4 = null;
      str1 = null;
      str5 = null;
      str2 = null;
      localObject = null;
      bool = false;
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    if (paramBoolean) {
      a(1, this.b);
    }
    for (;;)
    {
      notifyDataSetChanged();
      return;
      a(1, null);
    }
  }
  
  public final boolean isEnabled(int paramInt)
  {
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     caj
 * JD-Core Version:    0.7.0.1
 */