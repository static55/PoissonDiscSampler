#Poisson Disc Sampler

This is a simple library that somewhat evenly arranges points in a graph.

##Examples

###A 200x200 graph with 500 points

        QuadTree quadTree = new QuadTree( 200, 200 );
        PoissonDiscSampler sampler = new PoissonDiscSampler( quadTree );
        sampler.setNumCandidates( 10 );
        sampler.addNumPoints( 500 );
        Point points[] = sampler.toArray(); // a 500 Point array
>![200x200 quadtree containing 500 points](https://github.com/static55/PoissonDiscSampler/raw/master/src/com/stewartrap/example/200x200x500pts.png)

###A 100x100 graph with 10 points

        QuadTree quadTree = new QuadTree( 100, 100 );
        PoissonDiscSampler sampler = new PoissonDiscSampler( quadTree );
        sampler.setNumCandidates( 10 );
        sampler.addNumPoints( 10 );
        Point points[] = sampler.toArray(); // a 10 Point array
>![100x100 quadtree containing 10 points](https://github.com/static55/PoissonDiscSampler/raw/master/src/com/stewartrap/example/100x100x10pts.png)

##Packages

###com.stewartrap.poissondiscsampler

- **PoissonDiscSampler.java**: The main library.

###com.stewartrap.example

- **MainDemo.java**: a simple app that you can use to generate graphs and write them as PNGs as shown in the above example images.
- You'll also find the above two example images in this directory. You don't need them.

###com.stewartrap.quadtree

- **Func.java**
- **Node.java**	
- **NodeType.java**
- **Point.java**
- **QuadTree.java**
- **QuadTreeException.java**

This is a tweaked version of the QuadTree library that you can find at `https://github.com/varunpant/Quadtree`. It's MIT licensed and Copyright (c) 2014 Varun Pant.

PoissonDiscSampler relies on this library.

##Legal

The MIT License

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
