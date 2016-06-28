import android.content.Context;
import android.database.Cursor;
import android.graphics.Rect;
import java.util.ArrayList;

public class avh<InputType, TransformedType>
{
  public final Context a;
  public final String b;
  public final Rect c;
  
  public avh(Context paramContext, String paramString, Rect paramRect)
  {
    this.a = paramContext;
    this.b = paramString;
    this.c = paramRect;
  }
  
  public ArrayList<atq> a(Cursor paramCursor)
  {
    ArrayList localArrayList = new ArrayList();
    if ((paramCursor == null) || (paramCursor.isClosed())) {}
    while (!paramCursor.moveToFirst()) {
      return localArrayList;
    }
    do
    {
      localArrayList.add(new atn(new arl(this.b, paramCursor.getString(3), paramCursor.getString(2), b(paramCursor), paramCursor.getLong(9), paramCursor.getPosition()), 0, this.c));
    } while (paramCursor.moveToNext());
    paramCursor.close();
    return localArrayList;
  }
  
  public ipf b(Cursor paramCursor)
  {
    long l = paramCursor.getLong(9);
    String str1 = paramCursor.getString(1);
    String str2 = paramCursor.getString(5);
    ipm localipm = jrf.a(l);
    return ipf.a(this.a, str1, str2, localipm);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     avh
 * JD-Core Version:    0.7.0.1
 */