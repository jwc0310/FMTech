import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public final class dfb
  extends cxl
{
  public dfb(Context paramContext)
  {
    super(paramContext);
    this.g = true;
    this.h = true;
  }
  
  public final View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    TextView localTextView = new TextView(paramContext);
    localTextView.setTextAppearance(paramContext, efj.yK);
    localTextView.setSingleLine(true);
    return localTextView;
  }
  
  public final void a(View paramView, Context paramContext, Cursor paramCursor)
  {
    TextView localTextView = (TextView)paramView;
    String str = paramCursor.getString(4);
    if (TextUtils.isEmpty(str)) {
      str = paramCursor.getString(3);
    }
    localTextView.setText(str);
  }
  
  public final View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (!this.a) {
      return null;
    }
    this.f.getContext();
    if (paramView == null) {
      paramView = this.f.inflate(efj.sq, paramViewGroup, false);
    }
    this.c.moveToPosition(paramInt);
    a(paramView, this.c);
    return paramView;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dfb
 * JD-Core Version:    0.7.0.1
 */