import React, { useState } from 'react';
import { Alert, View, StyleSheet } from 'react-native';
import { Button, Card, TextInput } from 'react-native-paper';
import axios from 'axios';

const API_BASE_URL = 'http://localhost:7777/theatre_admin';

const AddShow = ({ navigation }) => {
  const [show, setShow] = useState({
    showDate: '',
    movieId: '',
    screenId: '',
    timeId: '',
  });

  const handleAddShow = async () => {
    if (!show.showDate || !show.movieId || !show.screenId || !show.timeId) {
      Alert.alert('Error', 'Please fill in all fields');
      return;
    }

    const payload = {
      showDate: show.showDate,
      movie: { movieId: parseInt(show.movieId) },
      screen: { screenId: parseInt(show.screenId) },
      time: { timeId: parseInt(show.timeId) },
    };

    try {
      await axios.post(`${API_BASE_URL}/show`, payload);
      Alert.alert('Success', 'Show added successfully', [
        { text: 'OK', onPress: () => navigation.navigate('Dashboard') },
      ]);
      setShow({ showDate: '', movieId: '', screenId: '', timeId: '' });
    } catch (error) {
      Alert.alert('Error', 'Failed to add show');
    }
  };

  return (
    <View style={styles.container}>
      <Card style={styles.card}>
        <TextInput
          label="Show Date (YYYY-MM-DDTHH:MM:SS)"
          value={show.showDate}
          onChangeText={(text) => setShow({ ...show, showDate: text })}
          style={styles.input}
        />
        <TextInput
          label="Movie ID"
          value={show.movieId}
          keyboardType="numeric"
          onChangeText={(text) => setShow({ ...show, movieId: text })}
          style={styles.input}
        />
        <TextInput
          label="Screen ID"
          value={show.screenId}
          keyboardType="numeric"
          onChangeText={(text) => setShow({ ...show, screenId: text })}
          style={styles.input}
        />
        <TextInput
          label="Time ID"
          value={show.timeId}
          keyboardType="numeric"
          onChangeText={(text) => setShow({ ...show, timeId: text })}
          style={styles.input}
        />
        <Button mode="contained" onPress={handleAddShow} style={styles.button}>
          Add Show
        </Button>
      </Card>
    </View>
  );
};

export default AddShow;

const styles = StyleSheet.create({
  container: { flex: 1, justifyContent: 'center', padding: 20 },
  card: { padding: 20, backgroundColor: '#f5f5f5' },
  input: { marginBottom: 10 },
  button: { marginTop: 10 },
});
