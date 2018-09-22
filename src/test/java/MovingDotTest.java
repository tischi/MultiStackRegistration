import de.embl.cmci.registration.MultiStackReg_;
import ij.IJ;
import ij.ImagePlus;

public class MovingDotTest
{
	public static void main ( String... args )
	{
		final ImagePlus imagePlus = IJ.openImage( MovingDotTest.class.getResource( "moving-dot.zip" ).getFile() );
		imagePlus.show();

		new MultiStackReg_().run( "" );
	}
}
