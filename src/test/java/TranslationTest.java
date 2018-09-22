import de.embl.cmci.registration.MultiStackReg_;
import ij.IJ;
import ij.ImagePlus;

public class TranslationTest
{
	public static void main ( String... args )
	{
		final ImagePlus imagePlus = IJ.openImage( TranslationTest.class.getResource( "translation/MAX_30-pixel-translation-along-x.tif" ).getFile() );
		imagePlus.show();

		final ImagePlus imagePlus2 = IJ.openImage( TranslationTest.class.getResource( "translation/MAX_reference.tif" ).getFile() );
		imagePlus2.show();

		new MultiStackReg_().run( "" );
	}
}
