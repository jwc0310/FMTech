import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;

final class dhg
{
  Uri a;
  String b;
  
  final Uri a()
  {
    if (this.a == null) {
      throw new NullPointerException();
    }
    Uri.Builder localBuilder = Uri.parse("https://accounts.google.com/AccountChooser").buildUpon().appendQueryParameter("continue", this.a.toString());
    if (!TextUtils.isEmpty(this.b)) {
      localBuilder.appendQueryParameter("Email", this.b);
    }
    return localBuilder.build();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dhg
 * JD-Core Version:    0.7.0.1
 */