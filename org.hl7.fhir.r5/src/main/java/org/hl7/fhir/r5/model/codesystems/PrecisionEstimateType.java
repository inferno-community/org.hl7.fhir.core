package org.hl7.fhir.r5.model.codesystems;

/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.
  
*/

// Generated on Wed, Sep 18, 2019 03:45+1000 for FHIR v4.1.0


import org.hl7.fhir.exceptions.FHIRException;

public enum PrecisionEstimateType {

        /**
         * confidence interval.
         */
        CI, 
        /**
         * interquartile range.
         */
        IQR, 
        /**
         * standard deviation.
         */
        SD, 
        /**
         * standard error.
         */
        SE, 
        /**
         * the interval in which a  parameter has a given probability.
         */
        CRI, 
        /**
         * added to help the parsers
         */
        NULL;
        public static PrecisionEstimateType fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("CI".equals(codeString))
          return CI;
        if ("IQR".equals(codeString))
          return IQR;
        if ("SD".equals(codeString))
          return SD;
        if ("SE".equals(codeString))
          return SE;
        if ("CrI".equals(codeString))
          return CRI;
        throw new FHIRException("Unknown PrecisionEstimateType code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case CI: return "CI";
            case IQR: return "IQR";
            case SD: return "SD";
            case SE: return "SE";
            case CRI: return "CrI";
            default: return "?";
          }
        }
        public String getSystem() {
          return "http://terminology.hl7.org/CodeSystem/precision-estimate-type";
        }
        public String getDefinition() {
          switch (this) {
            case CI: return "confidence interval.";
            case IQR: return "interquartile range.";
            case SD: return "standard deviation.";
            case SE: return "standard error.";
            case CRI: return "the interval in which a  parameter has a given probability.";
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case CI: return "confidence interval";
            case IQR: return "interquartile range";
            case SD: return "standard deviation";
            case SE: return "standard error";
            case CRI: return "credible interval";
            default: return "?";
          }
    }


}

