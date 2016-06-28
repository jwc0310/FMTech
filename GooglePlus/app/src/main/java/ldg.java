import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.social.squares.members.SquareMemberListItemView;

final class ldg
  extends lhe
{
  private static final String[] l = { "_id", "qualified_id", "name", "avatar", "membership_status" };
  lfc a;
  private final String m;
  private final boolean n;
  
  public ldg(Context paramContext, bw parambw, cv paramcv, int paramInt, String paramString, boolean paramBoolean)
  {
    super(paramContext, parambw, paramcv, paramInt, 0);
    this.m = paramString;
    this.n = paramBoolean;
  }
  
  protected final int a(Exception paramException)
  {
    if (kdd.a(paramException, "MEMBER_SEARCH_TOO_MANY_MATCHES")) {
      return 4;
    }
    return 3;
  }
  
  protected final View a(Context paramContext, ViewGroup paramViewGroup)
  {
    return LayoutInflater.from(paramContext).inflate(efj.Xs, paramViewGroup, false);
  }
  
  protected final lhh a(String paramString)
  {
    return new ldi(this.aM, this.c, this.g, paramString, this.m, l, 2);
  }
  
  protected final void a(View paramView, int paramInt)
  {
    int i;
    int j;
    View localView;
    int k;
    switch (paramInt)
    {
    case 2: 
    default: 
      i = eb.p;
      j = 0;
      localView = paramView.findViewById(aau.Cj);
      k = 0;
      if (j == 0) {
        break;
      }
    }
    for (;;)
    {
      localView.setVisibility(k);
      ((TextView)paramView.findViewById(aau.Ci)).setText(this.aM.getText(i));
      return;
      int i1 = eb.l;
      j = 1;
      i = i1;
      break;
      i = eb.k;
      j = 0;
      break;
      i = eb.o;
      j = 0;
      break;
      i = eb.n;
      j = 0;
      break;
      k = 8;
    }
  }
  
  protected final void a(View paramView, Cursor paramCursor)
  {
    ((SquareMemberListItemView)paramView).a(paramCursor.getString(1), paramCursor.getString(2), hdo.b(paramCursor.getString(3)), paramCursor.getInt(4), this.n).a = this.a;
  }
  
  protected final View b(Context paramContext, ViewGroup paramViewGroup)
  {
    return LayoutInflater.from(paramContext).inflate(efj.Xr, paramViewGroup, false);
  }
  
  protected final String[] b()
  {
    return l;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ldg
 * JD-Core Version:    0.7.0.1
 */