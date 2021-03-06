# jme3-recast4j-test-1
This project was born with the aim of creating a bridge API between the recast4j library and jMonkeyEngine.

This project optimizes and adds new tools and features to the original project [jme3-recast4j](https://github.com/MeFisto94/jme3-recast4j-demo/wiki)

### Recently added features:
- NavMeshAgent that allows you to move the character in the Scene using the NavMesh.
- NavMeshQueryFilter - Specifies which areas to consider when searching the NavMesh.
- NavMeshTools - Use the NavMesh class to perform spatial queries such as pathfinding and walkability tests.
- NavMeshBuildMarkup allows you to control how certain objects are treated during the NavMesh build process, specifically when collecting sources for building.
- NavMeshBuildSettings allows you to specify a collection of settings which describe the dimensions and limitations of a particular agent type.
- StraightPathOptions
- NavMeshDebugViewer
- NavPathDebugViewer
- SoloNavMeshBuilder
- TileNavMeshBuilder
- IORecast to export **NavMesh** in .obj format.
- Graphic editor to modify the NavMesh generation parameters at Runtime.

# Requirements
The individual projects and their respective requirements used in this demo can be found by following these links.

- [jmonkeyengine](https://github.com/jMonkeyEngine/jmonkeyengine) - A complete 3D game development suite written purely in Java.
- [Minie](https://github.com/stephengold/Minie) - A physics library for JMonkeyEngine.
- [recast4j](https://github.com/ppiastucki/recast4j) - Java Port of Recast & Detour navigation mesh toolset.
- [Lemur](https://github.com/jMonkeyEngine-Contributions/Lemur) - jMonkeyEngine-based UI toolkit.
- java 11+

# Documentation
- [Recast Navigation for JME](https://wiki.jmonkeyengine.org/docs/3.4/contributions/ai/recast.html)
- [Building Process Slides](https://github.com/capdevon/jme3-recast4j-test-1/blob/main/docs/MikkoMononen_RecastSlides.pdf) - A series of slides that explain the build process of Recast.

# Youtube videos
[Demo Navigation-mesh](https://www.youtube.com/watch?v=XVWxy30IH7Q)

[Demo Agent-based Crowd Simulation](https://www.youtube.com/watch?v=0yvne6mQVy4)

# 
Crowd Agent WIP
![Screenshot](images/crowd-agent-2.jpg)
???NEW Editor
![Screenshot](images/editor-2.jpg)
Solo NavMesh
![Screenshot](images/buildSoloModified-2.jpg)
IORecast export .obj
![Screenshot](images/navmesh-obj-export.jpg)

# Credits
Huge thanks to MeFisto94 ad mitm001 for writing the original project this is based on.
