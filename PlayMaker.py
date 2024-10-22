import sys
from EvalVisitor import *

# Función principal para evaluar el archivo de entrada
def main():
    if len(sys.argv) == 2:
        # Leer desde archivo
        archivo_fuente = sys.argv[1]
        try:
            with open(archivo_fuente, 'r') as f:
                contenido = f.read()
            print(f"Procesando archivo: {archivo_fuente}")
            inputStream(contenido)
        except FileNotFoundError:
            print(f"Error: El archivo '{archivo_fuente}' no se encontró.")
    else:
        # Leer desde la consola
        print("Ingrese la expresión (escriba 'end' para terminar):")
        contenido = ""
        while True:
            line = input()
            if line.strip().lower() == 'end':  # Comando para terminar la entrada
                break
            contenido += line + "\n"
        inputStream(contenido)

def inputStream(contenido):
    try:
        input_stream = InputStream(contenido)
        lexer = LenguageLexer(input_stream)
        stream = CommonTokenStream(lexer)
        parser = LenguageParser(stream)
        tree = parser.root()


        visitor = EvalVisitor()
        visitor.visit(tree)


    except DivisionPorCeroError as e:
        print(e)
    except ProcedimientoNoDefinidoError as e:
        print(e)
    except NumeroParametrosIncorrectoError as e:
        print(e)
    except OperacionAritmeticaError as e:
        print(e)
    except OperacionRelacionalError as e:
        print(e)
    except CondicionalError as e:
        print(e)
    except IteracionError as e:
        print(e)
    except Exception as e:
        print("Error inesperado:", e)

if __name__ == '__main__':
    main()