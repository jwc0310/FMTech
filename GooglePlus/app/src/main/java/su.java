import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class su
  extends so
{
  public sv f;
  private int[] g;
  private int[] h;
  private int i = -1;
  private String[] j;
  
  @Deprecated
  public su(Context paramContext, int paramInt, Cursor paramCursor, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    super(paramContext, paramInt, paramCursor);
    this.h = paramArrayOfInt;
    this.j = paramArrayOfString;
    a(paramArrayOfString);
  }
  
  private final void a(String[] paramArrayOfString)
  {
    if (this.c != null)
    {
      int k = paramArrayOfString.length;
      if ((this.g == null) || (this.g.length != k)) {
        this.g = new int[k];
      }
      for (int m = 0; m < k; m++) {
        this.g[m] = this.c.getColumnIndexOrThrow(paramArrayOfString[m]);
      }
    }
    this.g = null;
  }
  
  public void a(View paramView, Context paramContext, Cursor paramCursor)
  {
    sv localsv = this.f;
    int k = this.h.length;
    int[] arrayOfInt1 = this.g;
    int[] arrayOfInt2 = this.h;
    int m = 0;
    View localView;
    if (m < k)
    {
      localView = paramView.findViewById(arrayOfInt2[m]);
      if (localView != null) {
        if (localsv == null) {
          break label200;
        }
      }
    }
    label165:
    label200:
    for (boolean bool = localsv.a(localView, paramCursor, arrayOfInt1[m]);; bool = false)
    {
      String str;
      if (!bool)
      {
        str = paramCursor.getString(arrayOfInt1[m]);
        if (str == null) {
          str = "";
        }
        if (!(localView instanceof TextView)) {
          break label122;
        }
        ((TextView)localView).setText(str);
      }
      for (;;)
      {
        m++;
        break;
        label122:
        if (!(localView instanceof ImageView)) {
          break label165;
        }
        ImageView localImageView = (ImageView)localView;
        try
        {
          localImageView.setImageResource(Integer.parseInt(str));
        }
        catch (NumberFormatException localNumberFormatException)
        {
          localImageView.setImageURI(Uri.parse(str));
        }
      }
      throw new IllegalStateException(localView.getClass().getName() + " is not a  view that can be bounds by this SimpleCursorAdapter");
      return;
    }
  }
  
  public final Cursor b(Cursor paramCursor)
  {
    Cursor localCursor = super.b(paramCursor);
    a(this.j);
    return localCursor;
  }
  
  public final CharSequence c(Cursor paramCursor)
  {
    if (this.i >= 0) {
      return paramCursor.getString(this.i);
    }
    return super.c(paramCursor);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     su
 * JD-Core Version:    0.7.0.1
 */