/*******************************************************************************
 * Copyright 2016
 * Ubiquitous Knowledge Processing (UKP) Lab
 * Technische Universität Darmstadt
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package align;

import java.io.IOException;


/**
 * @author Judith Eckle-Kohler
 *
 */
public class AlignVerbClasses
{

	/**
	 * @param args
	 * @throws IOException 
	 */
    public static void main(String[] args) throws IOException
	{
	    
		VerbClassAligner aligner = new VerbClassAligner();						
		aligner.initialize("target/imslexSubset","ModalityVerbs");
		
		aligner.alignToGermaNet();
		aligner.alignToVerbNet();
		
		/*
		 * write the datasets in tsv format
		 */		
		aligner.writeGermaNetAlignment();
		aligner.writeVerbNetAlignment();
		
	}

}