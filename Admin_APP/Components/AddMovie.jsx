import React, { useState } from 'react';
import { Alert, View, StyleSheet } from 'react-native';
import { Button, Card, TextInput } from 'react-native-paper';
import axios from 'axios';

const API_BASE_URL = 'http://localhost:7777/theatre_admin';

const AddMovie = ({ navigation }) => {
  const [movie, setMovie] = useState({
    movieName: '',
    description: '',
    duration: '',
    genre: '',
    releaseDate: '',
    language: '',
  });

  const handleAddMovie = async () => {
    if (!movie.movieName || !movie.description || !movie.duration || !movie.genre || !movie.releaseDate || !movie.language) {
      Alert.alert('Error', 'Please fill in all fields');
      return;
    }

    try {
      await axios.post(`${API_BASE_URL}/movie`, movie);
      Alert.alert('Success', 'Movie added successfully', [
        { text: 'OK', onPress: () => navigation.navigate('Dashboard') }
      ]);
      setMovie({ movieName: '', description: '', duration: '', genre: '', releaseDate: '', language: '' });
    } catch (error) {
      Alert.alert('Error', 'Failed to add movie');
    }
  };

  return (
    <View style={styles.container}>
      <Card style={styles.card}>
        <TextInput
          label="Movie Name"
          value={movie.movieName}
          onChangeText={(text) => setMovie({ ...movie, movieName: text })}
          style={styles.input}
        />
        <TextInput
          label="Description"
          value={movie.description}
          onChangeText={(text) => setMovie({ ...movie, description: text })}
          style={styles.input}
        />
        <TextInput
          label="Duration (HH:MM)"
          value={movie.duration}
          onChangeText={(text) => setMovie({ ...movie, duration: text })}
          style={styles.input}
        />
        <TextInput
          label="Genre"
          value={movie.genre}
          onChangeText={(text) => setMovie({ ...movie, genre: text })}
          style={styles.input}
        />
        <TextInput
          label="Release Date (YYYY-MM-DD)"
          value={movie.releaseDate}
          onChangeText={(text) => setMovie({ ...movie, releaseDate: text })}
          style={styles.input}
        />
        <TextInput
          label="Language"
          value={movie.language}
          onChangeText={(text) => setMovie({ ...movie, language: text })}
          style={styles.input}
        />
        <Button mode="contained" onPress={handleAddMovie} style={styles.button}>
          Add Movie
        </Button>
      </Card>
    </View>
  );
};

export default AddMovie;

const styles = StyleSheet.create({
  container: { flex: 1, justifyContent: 'center', padding: 20 },
  card: { padding: 20, backgroundColor: '#f5f5f5' },
  input: { marginBottom: 10 },
  button: { marginTop: 10 },
});
