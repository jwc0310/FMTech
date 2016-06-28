import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.libraries.social.acl.PlusAclPickerActivity;
import java.util.ArrayList;

public final class gnv
{
  public final Intent a;
  
  public gnv(Context paramContext)
  {
    this.a = new Intent(paramContext, PlusAclPickerActivity.class);
  }
  
  public final gnv a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      this.a.putExtra("acl.PlusAclPickerActivity.SHAREOUSEL_ORDER", PlusAclPickerActivity.d);
      return this;
    case 2: 
      this.a.putExtra("acl.PlusAclPickerActivity.SHAREOUSEL_ORDER", PlusAclPickerActivity.e);
      return this;
    case 0: 
      this.a.putExtra("acl.PlusAclPickerActivity.SHAREOUSEL_ORDER", PlusAclPickerActivity.f);
      return this;
    }
    this.a.putExtra("acl.PlusAclPickerActivity.SHAREOUSEL_ORDER", PlusAclPickerActivity.g);
    return this;
  }
  
  public final gnv a(ArrayList<Parcelable> paramArrayList, String paramString)
  {
    this.a.putParcelableArrayListExtra("acl.PlusAclPickerActivity.SELECTION", paramArrayList);
    if (paramString != null) {
      this.a.putExtra("acl.PlusAclPickerActivity.SELECTION_SLIDE", paramString);
    }
    return this;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gnv
 * JD-Core Version:    0.7.0.1
 */