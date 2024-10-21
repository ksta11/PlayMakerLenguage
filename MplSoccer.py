import matplotlib.pyplot as plt
from mplsoccer import Pitch



class MplSoccer:

    def __init__(self, tacticName, play):
        self.tacticName = tacticName.strip('"')+".pdf"
        self.alignment = {
            'PO': (10, 50),  # Portero centrado
            'LD': (30, 20), 'CD': (30, 40), 'CI': (30, 60), 'LI': (30, 80),  # Defensores
            'MD': (50, 40), 'MI': (50, 60), 'MO': (60, 50),  # Mediocampistas
            'ED': (80, 20), 'DC': (80, 50), 'EI': (80, 80)  # Delanteros
        }
        self.play = play

        self.drawPlay()


    def drawFieldAlignment(self):
        """Dibuja el campo con la alineación fija."""
        pitch = Pitch(pitch_type='opta', pitch_color='grass', line_color='white')
        fig, ax = pitch.draw(figsize=(10, 7))

        # Dibujar los nombres de los jugadores en sus posiciones fijas
        for name, (x, y) in self.alignment.items():
            ax.text(x, y, name, ha='center', va='center', fontsize=10, color='black',
                    bbox=dict(facecolor='white', edgecolor='black', boxstyle='circle'))

        return fig, ax, pitch

    def drawPlay(self):
        fig, ax, pitch = self.drawFieldAlignment()  # Dibujar el campo y la alineación

        # Dibujar flechas para cada pase
        for playerOrigin, playerDestination in self.play:
            x1, y1 = self.alignment[playerOrigin]  # Coordenadas del jugador que hace el pase
            x2, y2 = self.alignment[playerDestination]  # Coordenadas del jugador que recibe el pase

            pitch.arrows(x1, y1, x2, y2, width=2, headwidth=10, headlength=10, 
                        color='blue', ax=ax)

        fig.savefig(self.tacticName, format='pdf', bbox_inches='tight')
        plt.close(fig)  # Cerrar la figura para liberar memoria
        print(f"El PDF se ha guardado como: {self.tacticName}")
