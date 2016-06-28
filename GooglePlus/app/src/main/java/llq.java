import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import java.nio.ByteBuffer;

public final class llq
  extends mab
  implements het
{
  String a;
  int b;
  SpannableString c;
  
  public llq(String paramString, Integer paramInteger, SpannableString paramSpannableString)
  {
    this.a = paramString;
    if (paramInteger != null) {}
    for (int i = paramInteger.intValue();; i = 0)
    {
      this.b = i;
      this.c = paramSpannableString;
      return;
    }
  }
  
  public static llq a(ByteBuffer paramByteBuffer)
  {
    String str = d(paramByteBuffer);
    int i = paramByteBuffer.getInt();
    byte[] arrayOfByte = b(paramByteBuffer);
    if (arrayOfByte == null) {}
    for (SpannableStringBuilder localSpannableStringBuilder = null;; localSpannableStringBuilder = lwh.a(ByteBuffer.wrap(arrayOfByte)))
    {
      SpannableString localSpannableString = new SpannableString(localSpannableStringBuilder.subSequence(0, localSpannableStringBuilder.length()));
      return new llq(str, Integer.valueOf(i), localSpannableString);
    }
  }
  
  public final int a()
  {
    return this.b;
  }
  
  public final SpannableString b()
  {
    return this.c;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     llq
 * JD-Core Version:    0.7.0.1
 */