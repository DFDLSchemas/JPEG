<?xml version="1.0" encoding="UTF-8"?>
<sch:schema xmlns:sch="http://purl.oclc.org/dsdl/schematron" 
    queryBinding="xslt2">
    
    <!--  
        NOTICE
        This software was produced for the U. S. Government under 
        Basic Contract No. W15P7T-13-C-A802, and is subject to the
        Rights in Noncommercial Computer Software and Noncommercial
        Computer Software Documentation Clause 252.227-7014 (FEB 2012)
        
        © 2017 The MITRE Corporation.
        
    -->
    
    <sch:pattern id="Marker-Ordering-Rules">
        <sch:rule context="JFIF">
            <sch:assert test="Marker[1][SOI]">
                SOI shall be first.
            </sch:assert>
            <sch:assert test="Marker[2][APP0]">
                APP0 shall be second.
            </sch:assert>
            <sch:assert test="if (Marker[APP0X]) then boolean(Marker[3][APP0X]) else true()">
                If present, APP0X shall be third.
            </sch:assert>
            <sch:assert test="Marker[last()][EOI]">
                EOI shall be last.
            </sch:assert>
            <sch:assert test="not((Marker/SOI)[2])">
                One SOI only.
            </sch:assert>
            <sch:assert test="not((Marker/EOI)[2])">
                One EOI only.
            </sch:assert>
            <sch:assert test="not((Marker/APP0)[2])">
                One APP0 only.
            </sch:assert>
            <sch:assert test="not((Marker/APP0X)[2])">
                One APP0X only.
            </sch:assert>
        </sch:rule>
    </sch:pattern>
    
</sch:schema>