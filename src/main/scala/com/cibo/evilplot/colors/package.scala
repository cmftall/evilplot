package com.cibo.evilplot

// turn off the warning about too many types defined in a file
// scalastyle:off
package object colors {
  sealed abstract class NamedColor(val repr: String) extends Color
  case object AliceBlue             extends NamedColor("aliceblue")
  case object AntiqueWhite          extends NamedColor("antiquewhite")
  case object Aqua                  extends NamedColor("aqua")
  case object Aquamarine            extends NamedColor("aquamarine")
  case object Azure                 extends NamedColor("azure")
  case object Beige                 extends NamedColor("beige")
  case object Bisque                extends NamedColor("bisque")
  case object Black                 extends NamedColor("black")
  case object BlanchedAlmond        extends NamedColor("blanchedalmond")
  case object Blue                  extends NamedColor("blue")
  case object BlueViolet            extends NamedColor("blueviolet")
  case object Brown                 extends NamedColor("brown")
  case object Burlywood             extends NamedColor("burlywood")
  case object CadetBlue             extends NamedColor("cadetblue")
  case object Chartreuse            extends NamedColor("chartreuse")
  case object Chocolate             extends NamedColor("chocolate")
  case object Coral                 extends NamedColor("coral")
  case object CornflowerBlue        extends NamedColor("cornflowerblue")
  case object Cornsilk              extends NamedColor("cornsilk")
  case object Crimson               extends NamedColor("crimson")
  case object Cyan                  extends NamedColor("cyan")
  case object DarkBlue              extends NamedColor("darkblue")
  case object DarkCyan              extends NamedColor("darkcyan")
  case object DarkGoldenrod         extends NamedColor("darkgoldenrod")
  case object DarkGray              extends NamedColor("darkgray")
  case object DarkGreen             extends NamedColor("darkgreen")
  case object DarkGrey              extends NamedColor("darkgrey")
  case object DarkKhaki             extends NamedColor("darkkhaki")
  case object DarkMagenta           extends NamedColor("darkmagenta")
  case object DarkOliveGreen        extends NamedColor("darkolivegreen")
  case object DarkOrange            extends NamedColor("darkorange")
  case object DarkOrchid            extends NamedColor("darkorchid")
  case object DarkRed               extends NamedColor("darkred")
  case object DarkSalmon            extends NamedColor("darksalmon")
  case object DarkSeagreen          extends NamedColor("darkseagreen")
  case object DarkSlateBlue         extends NamedColor("darkslateblue")
  case object DarkSlateGray         extends NamedColor("darkslategray")
  case object DarkSlateGrey         extends NamedColor("darkslategrey")
  case object DarkTurquoise         extends NamedColor("darkturquoise")
  case object DarkViolet            extends NamedColor("darkviolet")
  case object DeepPink              extends NamedColor("deeppink")
  case object DeepskyBlue           extends NamedColor("deepskyblue")
  case object DimGray               extends NamedColor("dimgray")
  case object DimGrey               extends NamedColor("dimgrey")
  case object DodgerBlue            extends NamedColor("dodgerblue")
  case object Firebrick             extends NamedColor("firebrick")
  case object FloralWhite           extends NamedColor("floralwhite")
  case object ForestGreen           extends NamedColor("forestgreen")
  case object Fuchsia               extends NamedColor("fuchsia")
  case object Gainsboro             extends NamedColor("gainsboro")
  case object Ghostwhite            extends NamedColor("ghostwhite")
  case object Gold                  extends NamedColor("gold")
  case object Goldenrod             extends NamedColor("goldenrod")
  case object Gray                  extends NamedColor("gray")
  case object Green                 extends NamedColor("green")
  case object GreenYellow           extends NamedColor("greenyellow")
  case object Grey                  extends NamedColor("grey")
  case object Honeydew              extends NamedColor("honeydew")
  case object HotPink               extends NamedColor("hotpink")
  case object IndianRed             extends NamedColor("indianred")
  case object Indigo                extends NamedColor("indigo")
  case object Ivory                 extends NamedColor("ivory")
  case object Khaki                 extends NamedColor("khaki")
  case object Lavender              extends NamedColor("lavender")
  case object LavenderBlush         extends NamedColor("lavenderblush")
  case object LawnGreen             extends NamedColor("lawngreen")
  case object LemonChiffon          extends NamedColor("lemonchiffon")
  case object LightBlue             extends NamedColor("lightblue")
  case object LightCoral            extends NamedColor("lightcoral")
  case object Lightyan              extends NamedColor("lightcyan")
  case object LightGoldenrodYellow  extends NamedColor("lightgoldenrodyellow")
  case object LightGray             extends NamedColor("lightgray")
  case object LightGreen            extends NamedColor("lightgreen")
  case object LightGrey             extends NamedColor("lightgrey")
  case object LightPink             extends NamedColor("lightpink")
  case object LightSalmon           extends NamedColor("lightsalmon")
  case object LightSeaGreen         extends NamedColor("lightseagreen")
  case object LightSkyBlue          extends NamedColor("lightskyblue")
  case object LightSlateGray        extends NamedColor("lightslategray")
  case object LightSlateGrey        extends NamedColor("lightslategrey")
  case object LightSteelblue        extends NamedColor("lightsteelblue")
  case object LightYellow           extends NamedColor("lightyellow")
  case object Lime                  extends NamedColor("lime")
  case object LimeGreen             extends NamedColor("limegreen")
  case object Linen                 extends NamedColor("linen")
  case object Magenta               extends NamedColor("magenta")
  case object Maroon                extends NamedColor("maroon")
  case object MediumAquamarine      extends NamedColor("mediumaquamarine")
  case object MediumBlue            extends NamedColor("mediumblue")
  case object MediumOrchid          extends NamedColor("mediumorchid")
  case object MediumPurple          extends NamedColor("mediumpurple")
  case object MediumSeagreen        extends NamedColor("mediumseagreen")
  case object MediumSlateBlue       extends NamedColor("mediumslateblue")
  case object MediumSpringGreen     extends NamedColor("mediumspringgreen")
  case object MediumTurquoise       extends NamedColor("mediumturquoise")
  case object MediumVioletRed       extends NamedColor("mediumvioletred")
  case object MidnightBlue          extends NamedColor("midnightblue")
  case object MintCream             extends NamedColor("mintcream")
  case object MistyRose             extends NamedColor("mistyrose")
  case object Moccasin              extends NamedColor("moccasin")
  case object NavajoWhite           extends NamedColor("navajowhite")
  case object Navy                  extends NamedColor("navy")
  case object Oldlace               extends NamedColor("oldlace")
  case object Olive                 extends NamedColor("olive")
  case object Olivedrab             extends NamedColor("olivedrab")
  case object Orange                extends NamedColor("orange")
  case object OrangeRed             extends NamedColor("orangered")
  case object Orchid                extends NamedColor("orchid")
  case object PaleGoldenrod         extends NamedColor("palegoldenrod")
  case object PaleGreen             extends NamedColor("palegreen")
  case object PaleTurquoise         extends NamedColor("paleturquoise")
  case object PaleVioletRed         extends NamedColor("palevioletred")
  case object Papayawhip            extends NamedColor("papayawhip")
  case object PeachPuff             extends NamedColor("peachpuff")
  case object Peru                  extends NamedColor("peru")
  case object Pink                  extends NamedColor("pink")
  case object Plum                  extends NamedColor("plum")
  case object PowderBlue            extends NamedColor("powderblue")
  case object Purple                extends NamedColor("purple")
  case object Red                   extends NamedColor("red")
  case object RosyBrown             extends NamedColor("rosybrown")
  case object RoyalBlue             extends NamedColor("royalblue")
  case object SaddleBrown           extends NamedColor("saddlebrown")
  case object Salmon                extends NamedColor("salmon")
  case object SandyBrown            extends NamedColor("sandybrown")
  case object Seagreen              extends NamedColor("seagreen")
  case object Seashell              extends NamedColor("seashell")
  case object Sienna                extends NamedColor("sienna")
  case object Silver                extends NamedColor("silver")
  case object SkyBlue               extends NamedColor("skyblue")
  case object SlateBlue             extends NamedColor("slateblue")
  case object SlateGray             extends NamedColor("slategray")
  case object SlateGrey             extends NamedColor("slategrey")
  case object Snow                  extends NamedColor("snow")
  case object SpringGreen           extends NamedColor("springgreen")
  case object SteelBlue             extends NamedColor("steelblue")
  case object Tan                   extends NamedColor("tan")
  case object Teal                  extends NamedColor("teal")
  case object Thistle               extends NamedColor("thistle")
  case object Tomato                extends NamedColor("tomato")
  case object Turquoise             extends NamedColor("turquoise")
  case object Violet                extends NamedColor("violet")
  case object Wheat                 extends NamedColor("wheat")
  case object White                 extends NamedColor("white")
  case object WhiteSmoke            extends NamedColor("whitesmoke")
  case object Yellow                extends NamedColor("yellow")
  case object YellowGreen           extends NamedColor("yellowgreen")
  // scalastyle:on
}