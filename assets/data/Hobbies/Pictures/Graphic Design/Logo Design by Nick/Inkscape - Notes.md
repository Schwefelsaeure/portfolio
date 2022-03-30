# Inkscape

Watch out: Boolean operations do not work when grouped elements are involved! Workaround: Ungroup and unite the elements.

## 01 - Simple Letter Logo

1. Draw at least two letter-like shapes using circles and rectangles.
2. Fill shapes with a gradient.

## 02 - Inner Shadows

1. Write a letter.
2. Draw a rectangle behinde the letter (this will be the shadow).
3. Shift rectangle a bit on x and y axis.
4. Bring letter to front a cut out shadow from rectangle (Object -> Clip -> Set).

**Tip:** Before step (4), duplicate letter so it can be colorized later on because the clip operation deletes the (cutting) shape.

## 03 - Abstract Vector Background

1. Create a background and apply a grid gradient (ust different colors for all four vertices).
2. Create vertices all over the rectangle and apply "Extensions -> Path -> From Path -> Voronoi Diagram" (use "Delauny Triangulation" and take care that you do not have overlapping vertices!).
3. Ungroup the generated paths to get distinct triangles.
4. Use the color picker to apply the underlying color to each triangle.

**Tip:** After finishing, select all and duplicate all trinagles to get rid of aliasing effects between the triangles.

## 04 - Infinite Loop Icon

1. Make a drop-like shape by starting with a circle and an rectangle (the rectangle is a helping shape).
2. Duplicate the drop-like shape and stick them together and keep only the outline.
3. At the connecting segements, form the difference between a path and the segments so that one lane is above the other lane of the infinite loop icon.

## 05 - Text Styling

1. Write a text with the text tool.
2. Duplicate the text, colorize the area and the contour and increase stroke size.
3. Move the duplicated text below the existing text layer.
4. Optional: Select all text layer, ungroup them an group individual letters and move the around.

## 06 - Low Poly Portrait

1. Drag an image into inkscape and place it onto an own layer (lock the layer).
2. Use the bezier pen to draw small shapes and use the color tool (F7) to pick the color below the shape.

**Tip:** Use mutliple small shapes for the eyebrows, the eyes an other sophistacted parts.

## 07 - Logo Design

1. Create crossing pencils (use unfilled rectangles to create 3D-like pencils and Bezier selector).
2. Use rectangles to create flying stripes.
3. Write text on top and on bottom of a circle.
4. Add contour lines between the top and bottom text.

## 08 - Simple Box Icon

1. Start with regular polygon with six vertices.
2. Duplicate polygon, shift it and use Boolean operations to get first flap.
3. Flip first flap horizontally to get second flap and so so.
4. Use Boolean oeprations to get all strokes right.
5. Use break apart to get all box secments separately und colorize them.

## 09 - Hexagon

1. Create a polygon with six vertices and align edges vertically.
2. Duplicate polygon from (1) and use `Path -> Difference` to create an arrow shape.
3. Duplicate the shape, rotate it and snap it to the existing arrow shape.

**Tip:** Use a gradient with three stops to colorize the arrow shape.

## 10 - Water Drop Icon

1. Create a square and use node tool to form a water drop shape.
2. Duplicate water drop shape and decrease size multiple times and layer these shapes on top of each other.
3. Use different shades of blue to colorize all shapes and use Boolean operations to create some white reflection shapes.

## 11 - Layered Sphere Icon

1. Extensions -> Rendering -> Wireframe Sphere (latitudes: 6, longitudes: 14, rotate: 120, check "hide")
2. Move lowest layer (circle).
3. Select all other shapes: Path -> Union and Path -> Decompose
4. Delete every second shape.
5. Colorize remaining shapes (and use circle fom (2) to create a shadow effect).
6. Copy shape and flip it vertically.

The following procedure yields the individuals rings of the sphere after creating the wireframe in step (1):
1. Ungroup the wireframe from (1) until all distinct segments can be selected individually.
2. Delete all latitudes and keep only the horizontal longitudes.
3. Select all, fill black and use an opacity of 50% to see all segements properly.
4. Select all and convert all contours to paths (this removes the path fillings).
5. Unite all segments.
6. Select all and decompose paths => the united paths are separated and can be selected individually

## 12 - Circle Infographic

1. Start with a circle and use a smaller circle to cut out a donut shape.
2. Use rectangles to split the donut into three segments.
3. Use the nodes tool to transform the end points of the segements into arrow shapes.
4. Use as background a radial gradient.

## 13 - Simple Folder Icon

1. Start with a rectangle and color it yellow.
2. Duplicate (1), color it orange, lower in beneath (1)
3. Convert to path and drag upper two nodes a little top left to get a 3D effect.
4. Add nodes on top of (3) to create a folder tab.
5. Duplicate (1) and lower it beneath (1) as documents.

## 14 - Photographic Text Effect

1. Drag an image into Inkscape.
2. Place text on top of image.
3. Object -> Cut -> Set
4. Optional: Before (3), copy text and use this copy to make an outline in white or black (you can also use another copy to create a shadow for this outline).

## 15 - Simple Ribbon with Text

1. Start with a rectangle and a text in it.
2. On left side of the rectangle, add a node an push it inside to get the form of a wing.
3. Duplicate (3) and flip it on the vertical axis.
4. On the connection, draw some shadow shapes using the Bezier pen.
5. Select all and shear it along the vertical axis one step.

**Tip:** Use a drop shadow for the text (i.e., duplicate it, color it black, an move it along the horizontal and vertical axis).

## 16 - Battery Icon

1. Start with two ellipses.
2. Connect the ellipses with the Bezier pen.
3. Duplicate the unioned shaped from (1) and (2), use a thick outline and use `Path -> Contour to path`.
4. Add three lines as charging indicators.
5. Add a plus pole on top.

**Note:** Use Boolean operations to create negative space inside the battery so that only most of the outline is colored.

## 17 - Abstract Wavy Lines

1. Draw a curvy line using the Bezier pen.
2. Duplicate path from (1).
3. Path -> Path effects -> Stich subpath

## 18 - Warped Text into Shape

1. Use ellipses to create a fish-like shape.
2. Create text.
3. Path -> Path effects -> Envelope deformation (disable 2nd checkbox)

## 19 - Vector Silhouttes from Raster Graphics

1. Open raster graphc in Gimp and separate subject from background by colorizing subject black with the pencil tool.
2. Apply a black-white threshold to highlight the subject even more.
3. Copy raster image to Inkscape.
4. Path -> Trace bitmap (use color quantization (with two to three colors).

## 20 - Flame Icon

1. Create an eye shape using the ellipses or the rectangle tool (plus node tool).
2. Use the pen tool and use shape from (1) to create an S-shaped curve (this will be the outline of the flame).
   * Enable: "Form: From clipboard" (**Note: This option stretches the object along the whole path with no repetition)
   * Scale down the S shape and turn off "Scale contour width" to get a thick drawing.
3. Duplicate S shape and arrange it as flame.

## 21 - Graffiti on a Brick Wall

1. Create a text using a handwritten font.
2. Duplicate text from (1), make it a path, increase path size and arrange it behind the text.
3. Add irregular splashes and scribblings to (2) using the rectangle and the node tool.
4. Add raster graphic of bricks.
5. Duplicate (4), bring it to top, select (5) and text from (2): Object -> Mask -> Set

**Tips:**

* Use fonts from https://www.fontsquirrel.com/.
* In GNU/Linux, install fonts to `/usr/share/fonts/truetype`.

## 22 - Simple Paper Airplane

1. Create a triangle by using the rectangle tool and the node tool to delete unnecessary nodes.
2. Use the resize handles to make the triangle isosceles.
3. Duplicate (2) two times and create shadows from these duplicates.
4. Use Bezier pen to draw another shadow at the bottom of the airplane (to visualize the airplane mounting).

## 23 - Vector Smoke

1. Create three "spiro" pen strokes: Pen -> Mode: Spiro
2. Extensions -> From path -> interpolate (ca. 30 steps)
3. Use a gradient for coloring.

## 24 - Wireframe Patterns

1. Create a circle, star or any other shape and just keep its outline.
2. Duplicate (1) and shrink it.
3. Combine paths and add path effect: Path -> Path effects -> Stitch paths (use around 75 paths)

## 25 - Text Portraits

1. Copy raster image to Inkscape.
2. Create (black) background rectangle and copy size from (1).
3. Write (white) text on background.
4. Bring (1) to front, select text and (1): Object -> Mask -> set

## 26 - Wavy Lines using Lattice Deformation

1. Draw lines using the Bezier pen.
2. Combine all paths: Path -> Path effects -> Lattice Deformation 2
3. Use node tool to play around with the deformation.

## 27 - Lightning Bolt Icon

1. Create a circle.
2. Create two triangles and arrange them as lightning bolt.
3. Shear (2) horizontally.
4. Duplicate (3), center it on (1) and make it bigger.

## 28 - Comic Logo

1. Create a black circle on top of a white rectangle with the same size.
2. Create a small circle: Edit -> Clone -> Tile clone... (clone color and shape).
3. Remove (1) and (2)
4. Create a star with eight corners and make inset vertices rounded nodes.
5. Place text (with and outline and a drop shadow) on top. **Tip:** Ungroup characters and place them very close to each other to get a comic look.

## 29 - Repeat an Object Around a Path

1. Create an object.
2. Create a path.
3. Path -> Path effects -> Pattern along path

**Note:** The repeated object uses the path properties (fill and stroke).

## 30 - Vector Grunge Ring

1. Vectorize splash raster image.
2. Copy (1).
3. Use free-hand tool (with spiro option) and "Form from clipboard" to draw a circle.

## 31 - Custom Color Palettes

1. Create two squares and fill them with different colors.
2. Extensions -> From path -> Interpolate -> Checkbox "style"

## 32 - Dripping Text Effect

1. Create a text, convert it to path and ungroup letters.
2. Use node tool and edit each letter individually.
3. Select two nodes from (2), add new node, drag this node down, an drag handles of neighboring nodes to create a drip.

## 33 - Interlocking Letters

1. Create two separate letters, convert them to path and ungroup letters (so that boolean operations work).
2. Select top letter, select node tool: Path -> Linked offset (increase letter size a bit)
3. Create path from (2).
4. Use (3) and rectangles and "Path -> Difference" to cut out letter parts which lay in background to get an interlocking effect.

## 34 - Flow Text Around An Object

1. Outline object with Bezier pen.
2. Create a rectangle for the text.
3. Subtract (1) from (2) and simplify path of remainder.
4. Add text, select text and (3): Text -> Flow text into form
5. Select (3) and remove filling color.

## 35 - Line Style Letters

1. Create parallel vertical paths, rotate them 45° and combine them (which creates a single path object).
2. Create a text, convert it to a path and **ungroup** (to be able to apply path operations!).
3. Path -> Cut path (**Tip:** Dublicate (2) first to recognize cut out paths better)
4. Delete paths outside of letter (select multiple paths by Shift + Alt + Mouse Dragging).
5. Select remaining paths from (4): Path -> Contour to path (i.e., two path nodes are created at endpoints of lines) and join the two endpoints

## 36 - Custom Text Treatment

1. Use text tool to create some text.
2. Select (1), convert to path and ungroup (to be able to perform path operations).
3. Select each letter individually move it closer to neighboring letter.

## 37 - Reflective Text Effect

1. Add text, convert text to path and ungroup (to be able to perform path operations on).
2. Create a rectangle above the lower half, select text and rectangle and click "Path -> Division" to create an upper and a lower text part.
3. Create a rectangle above the lower half of the text and make the lower nodes wider to create some perspective.
4. Select text and go to "Path -> Path effects -> Envelope": Then click node tool and drag (white!) bottom nodes to the outer rectangle nodes.

## 38 - Neon Text Effect

1. Create a text, convert it to path, ungroup it and color it pink.
2. Duplicate (1) and color it white.
3. Extensions -> From Path -> Interpolate: 2 interpolations, method 2 and interpolate style
4. Select all objects, give them a continuously smaller outline from bottom to top (and blur them continuously from bottom to top).
5. Duplicate top most text, color it black (as shadow) and place in under top most object.

## 39 - Distressed Text Effect

1. Create a letter, convert it to path and ungroup it.
2. Apply: Extensions -> Modify path -> Jitter nodes (to create a rough boundary)
3. Create a scratchy SVG texture: Filter -> Distort -> Chalk and sponge (save as PNG and reconvert it to SVG)
4. Select the letter and the scratchy texture: Path -> intersection and Path -> difference

## Bonus: Create PDF Documents, Ebooks, Manuals

1. Create a rectangle as background.
2. Create a rectangle to highlight the margins: Object -> Object to guides
3. Create header and footer (use lines as divider)
4. Create content: banner at the top (with an image as background) and two columns for text.

**Tip:** Create a smaller duplicate of the letter to keep the boundary edges clear and unscratched.
