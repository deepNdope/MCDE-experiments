This folder contains the external library used for the experiments in the paper "Monte Carlo Dependency Estimation".

UDS: 
----
- The code was obtained from `http://eda.mmci.uni-saarland.de/prj/uds/`
- The .jar `uds.jar` file was recompiled after commenting several debugging statements via the following steps:

Add a `manifest.txt` file with content:
```
Manifest-Version: 1.0
Class-Path: .
Main-Class: Simulation
```
Run `jar -cfvm uds.jar manifest.txt . *class`

- This library is used for the implementation of `HiCS`, `CMI`, `MAC` and `UDS`. 
- The `uds.jar` file is distributed under the AGPLv3 license with the permission from its author, Hoang Vu Nguyen.

