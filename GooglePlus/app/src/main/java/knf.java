import android.content.Context;
import android.database.Cursor;
import android.view.View;
import com.google.android.libraries.social.sharekit.impl.drafts.DraftsFragment;

public final class knf
  extends su
{
  public knf(DraftsFragment paramDraftsFragment, Context paramContext, int paramInt, Cursor paramCursor, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    super(paramContext, paramInt, null, paramArrayOfString, paramArrayOfInt);
  }
  
  public final void a(View paramView, Context paramContext, Cursor paramCursor)
  {
    super.a(paramView, paramContext, paramCursor);
    View localView = paramView.findViewById(aau.BQ);
    long l = paramCursor.getLong(paramCursor.getColumnIndex("_id"));
    paramView.setTag(Long.valueOf(l));
    paramView.setOnClickListener(new kng(this, l, paramCursor.getString(paramCursor.getColumnIndex("reshare_activity_id"))));
    localView.setOnClickListener(new knh(this, l));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     knf
 * JD-Core Version:    0.7.0.1
 */