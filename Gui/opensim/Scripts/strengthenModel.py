# ----------------------------------------------------------------------- #
# The OpenSim API is a toolkit for musculoskeletal modeling and           #
# simulation. See http://opensim.stanford.edu and the NOTICE file         #
# for more information. OpenSim is developed at Stanford University       #
# and supported by the US National Institutes of Health (U54 GM072970,    #
# R24 HD065690) and by DARPA through the Warrior Web program.             #
#                                                                         #   
# Copyright (c) 2005-2012 Stanford University and the Authors             #
#                                                                         #   
# Licensed under the Apache License, Version 2.0 (the "License");         #
# you may not use this file except in compliance with the License.        #
# You may obtain a copy of the License at                                 #
# http://www.apache.org/licenses/LICENSE-2.0.                             #
#                                                                         # 
# Unless required by applicable law or agreed to in writing, software     #
# distributed under the License is distributed on an "AS IS" BASIS,       #
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or         #
# implied. See the License for the specific language governing            #
# permissions and limitations under the License.                          #
# ----------------------------------------------------------------------- #

# This example increases the maxIsometricForce of all the muscles in the currently loaded model.
# A pop-up dialog displays a confirmation with the name of the new model.

# Get handle to current model in GUI
oldModel = getCurrentModel()
if not oldModel:
	print "ERROR: Need to load a model first\n"

# Create a fresh copy
myModel = modeling.Model(oldModel)

# Initialize the copy
myModel.initSystem()

# Name the copy for later showing in GUI
oldName = oldModel.getName()
myModel.setName(oldName+"_Stronger")

# Define a scale factor for MaxIsometricForce of muscles
scaleFactor = 1.2

# Apply scale factor to MaxIsometricForce
for i in range(myModel.getMuscles().getSize()):
	currentMuscle = myModel.getMuscles().get(i)
	currentMuscle.setMaxIsometricForce(currentMuscle.getMaxIsometricForce()*scaleFactor)

# Save resulting model
fullName = oldModel.getInputFileName()
newName = fullName.replace('.osim', '_stronger.osim')
myModel.print(newName)

#Popup a dialog to show the file name used to save the model
win = swing.JFrame("Confirm")
dLabel = swing.JLabel("Wrote stronger model to file "+newName)
win.getContentPane().add(dLabel)
win.pack()
win.show()







