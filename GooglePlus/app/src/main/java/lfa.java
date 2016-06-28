import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.social.squares.members.SquareMemberListItemView;

public final class lfa
  extends hqf
{
  public static final String[] a = { "_id", "qualified_id", "name", "avatar", "membership_status" };
  public static final String[] b = { "_id", "remaining_count" };
  public boolean c;
  public String d;
  private lfc e;
  private lfb f;
  
  public lfa(Context paramContext, boolean paramBoolean, lfc paramlfc, lfb paramlfb)
  {
    super(paramContext, (byte)0);
    for (int i = 0; i < 2; i++) {
      a(false, false);
    }
    this.c = paramBoolean;
    this.e = paramlfc;
    this.f = paramlfb;
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
    LayoutInflater localLayoutInflater = LayoutInflater.from(paramContext);
    switch (paramInt1)
    {
    default: 
      return localLayoutInflater.inflate(aau.Cm, paramViewGroup, false);
    }
    return localLayoutInflater.inflate(aau.Cn, paramViewGroup, false);
  }
  
  protected final void a(View paramView, int paramInt1, Cursor paramCursor, int paramInt2, ViewGroup paramViewGroup)
  {
    switch (paramInt1)
    {
    default: 
      return;
    case 0: 
      ((SquareMemberListItemView)paramView).a(paramCursor.getString(1), paramCursor.getString(2), hdo.b(paramCursor.getString(3)), paramCursor.getInt(4), this.c).a = this.e;
      return;
    }
    Resources localResources = this.aM.getResources();
    Object localObject;
    int k;
    switch (paramCursor.getInt(0))
    {
    default: 
      localObject = "";
      k = 0;
    }
    for (;;)
    {
      View localView = paramView.findViewById(eb.w);
      int m = 0;
      if (k != 0) {}
      String str;
      for (;;)
      {
        localView.setVisibility(m);
        ((TextView)paramView.findViewById(eb.u)).setText((CharSequence)localObject);
        return;
        str = localResources.getString(eu.g);
        if (this.f == null) {
          break label254;
        }
        this.f.a(this.d);
        k = 1;
        localObject = str;
        break;
        int i = paramCursor.getInt(1);
        int j = aau.Co;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(i);
        localObject = localResources.getQuantityString(j, i, arrayOfObject);
        k = 0;
        break;
        m = 8;
      }
      label254:
      k = 1;
      localObject = str;
    }
  }
  
  protected final boolean b(int paramInt1, int paramInt2)
  {
    if (paramInt1 == 1) {
      return false;
    }
    return super.b(paramInt1, paramInt2);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lfa
 * JD-Core Version:    0.7.0.1
 */