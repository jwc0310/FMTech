import android.content.Context;
import android.database.Cursor;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public final class ltu
  extends hqi
{
  private final StringBuilder f = new StringBuilder();
  private ltc g;
  
  public ltu(Context paramContext)
  {
    super(paramContext, null);
    this.g = ((ltc)mbb.a(paramContext, ltc.class));
  }
  
  private final void a(StringBuilder paramStringBuilder, ltb paramltb)
  {
    long l = paramltb.g;
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = Long.valueOf(0L);
    arrayOfObject1[1] = "Begin";
    paramStringBuilder.append(String.format("%d ms - %s\n", arrayOfObject1));
    if (!Collections.unmodifiableList(paramltb.e).isEmpty()) {}
    for (int i = 1; i != 0; i = 0)
    {
      List localList1 = Collections.unmodifiableList(paramltb.e);
      List localList2 = Collections.unmodifiableList(paramltb.f);
      int j = localList1.size();
      for (int k = 0; k < j; k++)
      {
        Object[] arrayOfObject3 = new Object[2];
        arrayOfObject3[0] = Long.valueOf(((Long)localList2.get(k)).longValue() - l);
        arrayOfObject3[1] = localList1.get(k);
        paramStringBuilder.append(String.format("%d ms - %s\n", arrayOfObject3));
      }
    }
    Object[] arrayOfObject2 = new Object[2];
    arrayOfObject2[0] = Long.valueOf(paramltb.h - paramltb.g);
    arrayOfObject2[1] = "End";
    paramStringBuilder.append(String.format("%d ms - %s\n", arrayOfObject2));
  }
  
  public final View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    return LayoutInflater.from(paramContext).inflate(aau.Dp, paramViewGroup, false);
  }
  
  public final void a(View paramView, Context paramContext, Cursor paramCursor)
  {
    if (paramCursor.getPosition() < super.getCount())
    {
      ltb localltb = this.g.a(paramCursor);
      a(this.f, localltb);
      TextView localTextView1 = (TextView)paramView.findViewById(efj.Zd);
      long l1 = localltb.b;
      localTextView1.setText(30 + "Category: " + l1);
      ((TextView)paramView.findViewById(efj.Zj)).setText(DateFormat.format("MM-dd hh:mm:ss", new Date(localltb.g)));
      ((TextView)paramView.findViewById(efj.Zh)).setText(localltb.a);
      TextView localTextView2 = (TextView)paramView.findViewById(efj.Ze);
      long l2 = localltb.h - localltb.g;
      localTextView2.setText(22 + l2 + "ms");
      ((TextView)paramView.findViewById(efj.Zi)).setText(this.f.toString());
      this.f.setLength(0);
    }
  }
  
  public final String b()
  {
    if (isEmpty()) {
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    Cursor localCursor = this.c;
    localCursor.moveToFirst();
    do
    {
      ltb localltb = this.g.a(localCursor);
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = localltb.a;
      arrayOfObject1[1] = Long.valueOf(localltb.h - localltb.g);
      localStringBuilder.append(String.format("Name: %s\tDuration:%dms\n", arrayOfObject1));
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = Long.valueOf(localltb.b);
      arrayOfObject2[1] = DateFormat.format("MM-dd hh:mm:ss", new Date(localltb.g));
      localStringBuilder.append(String.format("Categories:%d\tStarting Time:%s\n", arrayOfObject2));
      a(localStringBuilder, localltb);
      this.f.append('\n');
    } while (localCursor.moveToNext());
    return localStringBuilder.toString();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ltu
 * JD-Core Version:    0.7.0.1
 */