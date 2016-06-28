import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.text.DateFormat;
import java.util.Date;

public final class jat
  extends hqf
{
  private static final DateFormat a = ;
  
  public jat(Context paramContext)
  {
    super(paramContext);
    a(false, true);
    a(false, true);
  }
  
  protected final View a(Context paramContext, int paramInt1, Cursor paramCursor, int paramInt2, ViewGroup paramViewGroup)
  {
    return LayoutInflater.from(paramContext).inflate(efj.Qw, paramViewGroup, false);
  }
  
  protected final View a(Context paramContext, int paramInt, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    return LayoutInflater.from(paramContext).inflate(efj.Qv, paramViewGroup, false);
  }
  
  protected final void a(View paramView, int paramInt, Cursor paramCursor)
  {
    if (paramInt == 0) {}
    for (String str = "LAST NOTIFICATIONS SYNCS (%d)";; str = "LAST TICKLES RECEIVED (%d)")
    {
      TextView localTextView = (TextView)paramView.findViewById(efj.Qr);
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(paramCursor.getCount());
      localTextView.setText(String.format(str, arrayOfObject));
      return;
    }
  }
  
  protected final void a(View paramView, int paramInt1, Cursor paramCursor, int paramInt2, ViewGroup paramViewGroup)
  {
    long l = paramCursor.getLong(paramCursor.getColumnIndex("time"));
    String str1 = paramCursor.getString(paramCursor.getColumnIndex("comment"));
    String str2 = a.format(new Date(l));
    ((TextView)paramView.findViewById(efj.Qt)).setText(str2);
    TextView localTextView = (TextView)paramView.findViewById(efj.Qs);
    if (str1 != null) {}
    for (;;)
    {
      localTextView.setText(str1);
      return;
      str1 = "";
    }
  }
  
  public final void b(int paramInt, Cursor paramCursor)
  {
    int i = 1;
    if (paramInt == i) {
      i = 0;
    }
    super.a(i, paramCursor);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jat
 * JD-Core Version:    0.7.0.1
 */