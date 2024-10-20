import matplotlib.pyplot as plt
from mplsoccer import Pitch

def dibujar_campo_y_alineacion():
    """Dibuja el campo con la alineación fija."""
    pitch = Pitch(pitch_type='opta', pitch_color='grass', line_color='white')
    fig, ax = pitch.draw(figsize=(10, 7))

    # Dibujar los nombres de los jugadores en sus posiciones fijas
    for nombre, (x, y) in alineacion.items():
        ax.text(x, y, nombre, ha='center', va='center', fontsize=10, color='black',
                bbox=dict(facecolor='white', edgecolor='black', boxstyle='circle'))

    return fig, ax, pitch

def dibujar_secuencia_de_pases(pases, nombre_pdf="jugada.pdf"):
    """Dibuja la secuencia de pases en el campo."""
    fig, ax, pitch = dibujar_campo_y_alineacion()  # Dibujar el campo y la alineación

    # Dibujar flechas para cada pase
    for jugador_origen, jugador_destino in pases:
        x1, y1 = alineacion[jugador_origen]  # Coordenadas del jugador que hace el pase
        x2, y2 = alineacion[jugador_destino]  # Coordenadas del jugador que recibe el pase

        pitch.arrows(x1, y1, x2, y2, width=2, headwidth=10, headlength=10, 
                     color='blue', ax=ax)

    fig.savefig(nombre_pdf, format='pdf', bbox_inches='tight')
    plt.close(fig)  # Cerrar la figura para liberar memoria
    print(f"El PDF se ha guardado como: {nombre_pdf}")

# Diccionario con las posiciones fijas de los jugadores
alineacion = {
    'Portero': (5, 40),
    'LD': (20, 10), 'CD1': (20, 30), 'CD2': (20, 50), 'LI': (20, 70),
    'MCD': (40, 30), 'MCI': (40, 50), 'MO': (50, 40),
    'ED': (70, 10), 'DC': (70, 40), 'EI': (70, 70)
}

# Secuencia de pases usando solo nombres de los jugadores
pases = [
    ('Portero', 'CD1'),  # Portero -> CD1
    ('CD1', 'MCD'),      # CD1 -> MCD
    ('MCD', 'MO'),       # MCD -> MO
    ('MO', 'DC')         # MO -> DC
]

dibujar_secuencia_de_pases(pases, "secuencia_de_pases.pdf")
