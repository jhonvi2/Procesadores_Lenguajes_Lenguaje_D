parser grammar Anasint;
options{
 tokenVocab=Analex;
}
programa : PROGRAMA individuos relaciones tipos inicializacion descripciones ;

individuos : INDIVIDUOS DOSPUNTOS decl_individuos;
decl_individuos: IDENTINDIVIDUOSREL COMA decl_individuos
                |IDENTINDIVIDUOSREL ;

relaciones:RELACIONES DOSPUNTOS decl_relaciones;
decl_relaciones: IDENTINDIVIDUOSREL COMA decl_relaciones
               | IDENTINDIVIDUOSREL;


tipos:TIPOS DOSPUNTOS decl_tipos ;
decl_tipos: tipo (COMA tipo)*;
tipo: primitivo | no_primitivo;

primitivo:  IDENTTIPO PARENTESISABIERTO IDENTVARIABLE PARENTESISCERRADO ARROW  ;

no_primitivo: IDENTTIPO PARENTESISABIERTO IDENTVARIABLE PARENTESISCERRADO ARROW cuerpoTipo;

 cuerpoTipo:IDENTTIPO PARENTESISABIERTO IDENTVARIABLE PARENTESISCERRADO AND cuerpoTipo
            |IDENTTIPO PARENTESISABIERTO IDENTVARIABLE PARENTESISCERRADO;

inicializacion:INICIALIZACION DOSPUNTOS decl_inicializaciones ;
decl_inicializaciones:IDENTTIPO PARENTESISABIERTO IDENTINDIVIDUOSREL PARENTESISCERRADO COMA decl_inicializaciones
                     |IDENTTIPO PARENTESISABIERTO IDENTINDIVIDUOSREL PARENTESISCERRADO;


descripciones:DESCRIPCIONES DOSPUNTOS (decl_descripcion)* ;
decl_descripcion: descripcion  (consulta (COMA consulta)*)?;
descripcion: NUMERO DOSPUNTOS relacionesBinarias;
relacionesBinarias: IDENTINDIVIDUOSREL PARENTESISABIERTO IDENTINDIVIDUOSREL COMA IDENTINDIVIDUOSREL PARENTESISCERRADO COMA relacionesBinarias
                    |IDENTINDIVIDUOSREL PARENTESISABIERTO IDENTINDIVIDUOSREL COMA IDENTINDIVIDUOSREL PARENTESISCERRADO;


consulta: INTERROGACION IDENTVARIABLE TALQUE PARENTESISABIERTO condicion PARENTESISCERRADO ;

condicion: PARENTESISABIERTO condicion PARENTESISCERRADO                                                    #CondParentesis
           | IDENTTIPO PARENTESISABIERTO IDENTVARIABLE PARENTESISCERRADO                                    #CondTipo
           | condicion operador_logico condicion                                                            #CondClasico
           | IDENTINDIVIDUOSREL PARENTESISABIERTO IDENTVARIABLE COMA IDENTINDIVIDUOSREL PARENTESISCERRADO   #CondRelacion ;

operador_logico: (AND| OR);